
package Matrix;

public class Output2 {


    public static void main(String[] args) {
       int[][] out = new int[5][]; 
       int k=0;
       out[0]= new int[1];
       out[1]= new int[2];
       out[2]= new int[3];
       out[3]= new int[4];
       out[4]= new int[5];
       
           
        for (int row = 0; row < 5; row++) {

            for (int col = 0; col < row+1; col++) {
                out[row][col] = k;
                k++;

            }
        }
        
        for (int row = 0; row < 5; row++) {

            for (int col = 0; col < row+1; col++) {
                System.out.printf("\t%d",out[row][col]);

            }
            System.out.println("");
        }
        
        
    }
    
}
