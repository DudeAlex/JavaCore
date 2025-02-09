package prufung.ersetzen;


/*
b) Schreiben Sie eine main-Methode, in der Sie mit Hilfe der Methode ersetze im String
„Graphik.Init.Datei.ini“ die Punkte ersetzen. Geben Sie den veränderten Dateinamen auf der
Standardausgabe aus.
Hinweis: Aus der Klasse String dürfen Sie nur die Methode toCharArray() benutzen.
 */
public class Ersetzen {
    public int ersetze (char[] array) {
        int sum = 0;
        for (int i = 0; i < array.length - 3; i++) {
            if (array[i] == '.') sum++;
        }
        return sum;
    }


    public static void main(String[] args) {
        String str = "Graphik.Init.Datei.ini";

        System.out.println(ersetze(str));

    }

    public static char[] ersetze(String str){
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] == '.' && i != charArray.length - 4)
                charArray[i] = '_';
        }
        return charArray;
    }

}
