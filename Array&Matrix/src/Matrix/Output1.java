package Matrix;

public class Output1 {

    public static void main(String[] args) {
        int k = 0;
        int[][] out = new int[4][5];
        
    
        for (int row = 0; row < 4; row++) {

            for (int col = 0; col < 5; col++) {
                out[row][col] = k;
                k++;

            }
        }

        for (int row = 0; row < 4; row++) {

            for (int col = 0; col < 5; col++) {
                System.out.printf("\t%d",out[row][col]);

            }
            System.out.println("");
        }

    }

}
