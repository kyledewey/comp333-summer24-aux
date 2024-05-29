public class NetworkWriter implements Writer {
    private Socket socket;

    public NetworkWriter(NetworkLocation location) {	
	socket = new Socket(location);
    }

    public void writeThing(String thing) {
	socket.send(thing);
    }
    
    public void close() {
	socket.endConnection();
    }
}
