package collections.prog1prufung.fahrstrecke.spaceinvaders;

public class SpaceInvaders {

    private int v;

    private char[][] play = {{'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o'},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};


    public SpaceInvaders(){
        getSpaceship();
    }

    private void getSpaceship(){
        v = (int) (Math.random() * 8);
        play[4][v] = 'v';
    }


    public String toString(){
        String str = "";
        for(int i = 0; i < play.length; i++) {
            for (int j = 0; j < play[i].length; j++) {
                str += play[i][j] + " ";
            }
            str += "\n";
        }
        return str;
    }

    public void print(){
        for(int i = 0; i < play.length; i++){
            for(int j = 0; j < play[i].length; j++){
                System.out.print(play[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void bewege(char c) {
        switch (c){

            case 'a':
                if(v != 0) {
                    play[4][v] = ' ';
                    play[4][--v] = 'v';
                }
            break;

            case 'd':
                if(v != 7) {
                    play[4][v] = ' ';
                    play[4][++v] = 'v';
                }
            break;
        }
    }


}

