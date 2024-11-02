package hausaufgabe.lektion17.streamverdopplung;

import java.io.*;

public class OutputStreamDoubler extends OutputStream {
    OutputStream outputStream1;
    OutputStream outputStream2;

    public OutputStreamDoubler(OutputStream outputStream1, OutputStream outputStream2){
        this.outputStream1 = outputStream1;
        this.outputStream2 = outputStream2;
    }

    @Override
    public void write(int b) throws IOException {

        try{
            outputStream1.write(b);
        } catch (IOException e){
            e.printStackTrace();
        }
        try{
            outputStream2.write(b);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void close() throws IOException{
        IOException exception1 = null;
        IOException exception2 = null;
        try {
            outputStream1.close();
        } catch (IOException e){
            exception1 = new IOException("Fehler beim Schließen von outputStream1", e);
        }
        try {
            outputStream2.close();
        } catch (IOException e){
            exception2 = new IOException("Fehler beim Schließen von outputStream2", e);
            //if (exception == null) exception.addSuppressed(new IOException("Fehler beim Schließen von outputStream2", e));
            //else exception.addSuppressed(new IOException("Fehler beim Schließen von outputStream2", e));
        }
        if(exception1 != null) throw exception1;
        if(exception2 != null) throw exception2;

    }
    public static void main(String[] args){

        FileOutputStream fos1 = null;
        FileOutputStream fos2 = null;
        OutputStreamDoubler doubler = null;

        try{
            fos1 = new FileOutputStream("file1.txt");
            fos2 = new FileOutputStream("file2.txt");
            doubler = new OutputStreamDoubler(fos1, fos2);

            String data = "Hallo, dies ist ein Test!";
            for(byte b : data.getBytes()){
                doubler.write(b);
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try{
                if (doubler != null) {
                    doubler.close();
                }
                if (fos1 != null) {
                    fos1.close();
                }
                if (fos2 != null) {
                    fos2.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}


