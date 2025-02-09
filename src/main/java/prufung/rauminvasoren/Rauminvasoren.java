package prufung.rauminvasoren;


/*
Ergänzen Sie die Klasse, um eine Methode bewege, die einen einzelnen Buchstaben
übergeben bekommt.
 Wenn der Buchstabe a übergeben wird, soll das Raumschiff auf dem Spielfeld ein
Feld nach links bewegt werden.
 Wenn der Buchstabe d übergeben wird, soll das Raumschiff auf dem Spielfeld ein
Feld nach rechts bewegt werden.
 Wenn ein anderer Buchstabe übergeben wird, soll die Methode nichts machen.
Das Raumschiff soll nicht über den linken oder rechten Rand hinaus bewegt werden können.
 */
public class Rauminvasoren {

    private int v;
    char[][] game = {{'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o'},
                     {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                     {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                     {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                     {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

    public Rauminvasoren(){
        macheship();
    }

    private void macheship(){
        v = (int) (Math.random() * 8);
        game[4][v] = 'v';
    }

    public String toString() {
        String result = "";
        for(int i = 0; i < game.length;i++){
            for(int j = 0; j < game[i].length; j++){
                result += game[i][j] + " ";
            }
            result += "\n";
        }
        return result;
    }

    public void printGame(){
        for(int i = 0; i < game.length;i++){
            for(int j = 0; j < game[i].length; j++){
                System.out.print(game[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void move(char c) {
        switch (c){

            case 'a':
                if (v != 0) {
                    game[4][v] = ' ';
                    game[4][--v] = 'v';
                }
                break;

            case 'd':
                if(v != 7){
                    game[4][v] = ' ';
                    game[4][++v] = 'v';
                }
                break;
        }
    }

}

