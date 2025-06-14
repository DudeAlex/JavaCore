package collections.viertesemester.gamegalgenmaennchen;

import collections.viertesemester.gamegalgenmaennchen.GameGalgenmaennchen;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class TextServer {
    Game g;


    public TextServer(Game g) throws IOException {
        this.g = g;
        g.reset(); //starts new Game
    }

    public void start() throws IOException {
        try (ServerSocket ss = new ServerSocket(5000)) {
            while (true) {
                try {
                    Socket connection = ss.accept();
                    handleConnection(connection);
                } catch (IOException e) {
                    System.out.println("Verbindung fehlgeschlagen, Server läuft weiter...");
                }
            }
        }
    }


    public void start2() throws IOException {
        try (ServerSocket ss = new ServerSocket(5000)) {
            try(Socket connection = ss.accept()) {
                handleConnection(connection);
            }
        }
    }

    private void handleConnection(Socket connection) throws IOException {
        try(BufferedReader fromClient = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
            BufferedWriter toClient = new BufferedWriter(
                    new OutputStreamWriter(connection.getOutputStream()));) {
            String line = fromClient.readLine();
            if (line.equals(g.initGameString())) {
                writeToClient(toClient, g.welcomeString());
                play(fromClient, toClient);
            }
        } catch (IOException e){
            System.out.println("Game will be continued");
        }
    }
    protected void play(BufferedReader fromClient, BufferedWriter toClient)
            throws IOException {
        do {
            String line = fromClient.readLine();
            if (line == null) {
                g.reset();
                break;
            }

            writeToClient(toClient, g.handleInput(line));
        }
        while (g.running());
    }

    protected static void writeToClient(BufferedWriter toClient, String s) throws IOException {
        toClient.write(s);
        toClient.newLine();   // строка завершается переводом строки
        toClient.flush();     // важно: отправить всё клиенту
    }


    public static void main(String[] args) throws IOException{
        TextServer server = new TextServer(new GameGalgenmaennchen());
        server.start();
    }
}