package collections.prog1prufung.fahrstrecke.mozaik;

public class Mosaikpuzzle {

    boolean[][] motiv;
    private int[][] zifferMatrix;


    public Mosaikpuzzle(boolean[][] motiv) {
        this.motiv = motiv;
    }


    public int ermittleZahl(int x, int y) {
        int sum = 0;

        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                try {
                    if (motiv[i][j] == true) sum++;
                } catch (Exception e) {
                }
            }
        }
        return sum;
    }

    private int[][] convertMatrix() {
        zifferMatrix = new int[motiv.length][motiv[0].length];
        for (int i = 0; i < motiv.length; i++) {
            for (int j = 0; j < motiv[i].length; j++) {
                zifferMatrix[i][j] = ermittleZahl(i, j);
            }
        }
        return zifferMatrix;
    }

    public void printZifferMatrix(){
        zifferMatrix = convertMatrix();
        for(int i = 0; i < zifferMatrix.length; i++){
            for(int j = 0; j < zifferMatrix[i].length; j++){
                System.out.print(zifferMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
