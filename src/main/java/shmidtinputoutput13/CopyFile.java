package shmidtinputoutput13;

import javax.imageio.stream.ImageOutputStreamImpl;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }
        try (FileInputStream fin = new FileInputStream(args[0]);
             FileOutputStream fout = new FileOutputStream(args[1])) { //ВОПРОС: Что делает эта строка конкретно?
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ощибка ввода-вывода: " + e);
        }
    }
}


            /*
        } catch (IOException e) {
            System.out.println("проищошла ошибка ввода-вывода");
        }


        if(args.length != 2){
            System.out.println("Использование: CopyFile откуда куда");
            return;
        }
        try{
            fin = ); //ВОПРОС: Что делает эта строка конкретно?
            fout = new FileOutputStream(args[1]);
            do{
                i = fin.read();
                if(i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException e){
            System.out.println(c);
        } finally {
            try{
                if(fin != null) fin.close();
            } catch (IOException e2) {
                System.out.println("Ошибка закрытия файла ввода");
            }
            try{
                if(fout != null) fout.close();
            } catch (IOException e2){
                System.out.println("Ошибка закрытия файла вывода");
            }
        }
    }*/
