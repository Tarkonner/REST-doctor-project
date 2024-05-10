package Scripts;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class Server {
    static Socket clientSocket;
    static DataInputStream ingoingToServer;
    static DataOutputStream outgoingToClient;

    //Database
    List<Doctor> activeDoctors = new ArrayList<>();
    List<Admission> patiens = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(4444);
        System.out.println("Waiting for the client request");

        while (true) {
            clientSocket = serverSocket.accept();
            ingoingToServer = new DataInputStream(clientSocket.getInputStream());
            outgoingToClient = new DataOutputStream(clientSocket.getOutputStream());

            // Loop to continuously read messages from the client
            String message;

            //Treat input
            while ((message = ingoingToServer.readUTF())!= null) {
                message.toLowerCase();
                System.out.println("Message Received: " + message);

                //Commands
                switch (message) {
                    case "doctor":
                        System.out.println("Add doctor");
                        break;
                    case "find doctor":
                        FindDoctor();
                        break;
                    default:
                        outgoingToClient.writeUTF("No Command found");
                        break;
                }

                // Termination condition: if the client sends "exit"
                if (message.equalsIgnoreCase("exit")) {
                    break;
                }
            }

            serverSocket.close();
            System.out.println("Shutting down Socket server!!");
        }
    }    

    void AddDoctor()
    {

    }

    static void FindDoctor()
    {
        if (outgoingToClient!= null) {
            try {
                outgoingToClient.writeUTF("Finding Doctor");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    void AddPatient()
    {

    }
}