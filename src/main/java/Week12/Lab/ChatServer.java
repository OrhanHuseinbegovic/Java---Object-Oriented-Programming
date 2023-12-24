package Week12.Lab;

import java.io.IOException;
import java.io.Serial;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

        /*
        Implement a server class named ChatServer and maintain a list of ClientHandler
        objects to manage connected clients.
        Create a method named start that takes a port number as a parameter. Inside this method:
            1. Create a ServerSocket on the specified port.
            2. Print a message indicating that the server is running.
            3. Enter into a loop to continuously accept incoming client connections.
            4. For each new connection, create a Socket object and a corresponding ClientHandler.
            5. Add the ClientHandler to the list and start a new thread to handle the client.
         */
    private ServerSocket serverSocket;

    public ChatServer(ServerSocket serverSocket){
        this.serverSocket = serverSocket;
    }

    public void startServer(){
        try{
            while (!serverSocket.isClosed()){
                Socket socket = serverSocket.accept();
                System.out.println("New user has joined the chat!");
                ClientHandler clientHandler = new ClientHandler(socket);
                Thread thread = new Thread(clientHandler);
                thread.start();
            }
        }
        catch(IOException e){
            System.out.println("An exception occured!");
        }
    }

    /*
    Create a private method named broadcastMessage that takes a message (String) and
    the sender (ClientHandler) as parameters.
    Iterate through the list of clients and send the message to each client except the sender.

    Create a private inner class named ClientHandler that implements the Runnable interface.
    Maintain references to the client's Socket, BufferedReader, and PrintWriter.
    Implement a constructor to initialize these components.
     */
    public void closeServerSocket(){
        try{
            if(serverSocket!=null){
                serverSocket.close();
            }
        }
        catch (IOException e ){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket1 = new ServerSocket(1234);
        ChatServer chatServer = new ChatServer(serverSocket1);
        chatServer.startServer();
    }
}
