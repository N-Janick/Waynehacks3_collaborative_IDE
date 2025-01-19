from flask import Flask, render_template
from flask_socketio import SocketIO, emit, join_room, leave_room

app = Flask(_name_)
app.config['SECRET_KEY'] = 'secret!'  # Replace with a real secret key
socketio = SocketIO(app, cors_allowed_origins="*")

# Store active rooms and clients if needed
connected_clients = []

@app.route("/")
def index():
    return "WebSocket server is running"

@socketio.on('connect')
def handle_connect():
    print("Client connected")
    connected_clients.append(request.sid)

@socketio.on('disconnect')
def handle_disconnect():
    print("Client disconnected")
    connected_clients.remove(request.sid)

@socketio.on('text_update')
def handle_text_update(data):
    """
    Handle text update received from one client and broadcast it to others.
    'data' should be a dictionary containing the updated text.
    """
    print(f"Received text update: {data}")
    # Broadcast to all other clients except the sender
    emit('text_update', data, broadcast=True, include_self=False)

if _name_ == "_main_":
    socketio.run(app, host="0.0.0.0", port=5000)
