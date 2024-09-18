package hausaufgabe.lektion18.studiengangssplitter.gzipoutputStream;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Client {
    public static void main(String[] args)
            throws IOException {
        byte[] bytesToTransfer = "Hallo Welt\n".getBytes();
        Socket connectionToHost = new Socket("localhost", 5555);
        OutputStream os = connectionToHost.getOutputStream();

        GZIPOutputStream gzipOutputStream = new GZIPOutputStream(os);
    }
}
