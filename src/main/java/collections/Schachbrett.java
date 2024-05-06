package collections;

public class Schachbrett {
    boolean[][] brett = new boolean[8][8];

    public void setTower(int x, int y){
        for (int i = 0; i < 8; i++) {
            brett[x][i] = true;
            brett[i][y] = true;
        }
        brett[x][y] = true;
    }

    public String toString(){
        String result = "";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(brett[i][j]){
                    result += "x ";
                } else result += "o ";
            }
            result += "\n";

        }
        return result;
    }


    public static void main(String[] args) {
        Schachbrett schachbrett = new Schachbrett();
        schachbrett.setTower(3,5);
        System.out.println(schachbrett.toString());
    }


}
