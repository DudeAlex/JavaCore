package collections.prog1prufung.fahrstrecke.mozaik;

public class Motiv {

    public static final boolean[][] motiv = {{false, false, true, false, true, false, false, false, false, false},
                                             {false, false, true, true, true, false, false, false, false, false},
                                              {false, false, true, true, true, false, false, false, true, false},
                                              {false, false, true, true, true, false, false, true, false, false},
                                              {false, false, true, true, false, false, false, true, true, false},
                                              {false, false, true, true, true, true, false, false, true, true},
                                              {false, false, true, true, true, true, true, false, false, true},
                                              {false, true, true, true, true, true, true, false, false, true},
                                              {false, false, false, false, true, true, true, false, true, true},
                                              {false, false, false, true, true, true, true, true, true, false}};



    public static void printMotiv(){
        for(int i = 0; i < motiv.length; i++){
            for(int j = 0; j < motiv[i].length; j++){
                if(!motiv[i][j]) {
                    System.out.print(". ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
