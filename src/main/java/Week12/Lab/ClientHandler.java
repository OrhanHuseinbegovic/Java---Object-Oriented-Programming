package Week12.Lab;

import javax.imageio.IIOException;
import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class ClientHandler implements Runnable{
    /*
    Implement the run method in the ClientHandler class. Inside this method:
        1. Read the client's username and print a message about the user joining the chat.
        2. Broadcast this joining message to all clients.
        3. Enter into a loop to continuously read messages from the client and broadcast them to others.
        4. Handle IOExceptions and, in the finally block, close the client's socket and remove
        the ClientHandler from the list.

    Implement a method named sendMessage in the ClientHandler class to send messages to the client.
     */
    private static ArrayList<ClientHandler> clientHandlersList = new ArrayList<>();
    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String clientUsername;

    public ClientHandler(Socket socket){
        try{
            this.socket=socket;
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.clientUsername = bufferedReader.readLine();
            clientHandlersList.add(this);
            broadcastMessage("SERVER: "+clientUsername+ "has entered the chat!");
        }
        catch (IOException e){
            closeEverything(socket, bufferedReader, bufferedWriter);
        }
    }

    @Override
    public void run() {
        String messageFromClient;
        while (!socket.isClosed()){
            try {
                messageFromClient = bufferedReader.readLine();
                broadcastMessage(messageFromClient);
            }
            catch (IOException e){
                closeEverything(socket,bufferedReader,bufferedWriter);
                break;
            }
        }
    }

    public void broadcastMessage(String message){
        for (ClientHandler clientHandler : clientHandlersList){
            try {
                if (!clientHandler.clientUsername.equals(clientUsername)){
                    clientHandler.bufferedWriter.write(message);
                    clientHandler.bufferedWriter.newLine();
                    clientHandler.bufferedWriter.flush();
                }
            }
            catch (IOException e){
                closeEverything(socket,bufferedReader,bufferedWriter);
            }
        }
    }

    public void removeClientHandler(){
        clientHandlersList.remove(this);
        broadcastMessage("SERVER: "+clientUsername+" has left the chat!");
    }

    public void closeEverything(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter){
        removeClientHandler();
        try {
            if (bufferedReader!=null){
                bufferedReader.close();
            }
            if (bufferedWriter!=null){
                bufferedWriter.close();
            }
            if (socket!=null){
                socket.close();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
