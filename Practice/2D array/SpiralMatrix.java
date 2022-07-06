import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4},{5,6,7,8},{9,10,11,12}
        };

        // int[][] matrix = new int[3][3];
        
        // matrix[0][0] = 1;
        // matrix[0][1] = 2;
        // matrix[0][2] = 3;
        // matrix[1][0] = 8;
        // matrix[1][1] = 9;
        // matrix[1][2] = 4;
        // matrix[2][0] = 7;
        // matrix[2][1] = 6;
        // matrix[2][2] = 5;
        // System.out.println(matrix.length);
        // System.out.println(matrix[0].length);
        myfunc(matrix);
    }

    static void myfunc(int[][] matrix){
        int rowTop = 0 , colLeft = 0;
        int rowBottom = matrix.length-1 , colRight = matrix[0].length-1;
        List<Integer> demo = new ArrayList<>();
        int counter = (rowBottom+1) * (colRight+1);
        int count1 = 0;

        while(rowTop <= rowBottom || colLeft <= colRight){
            if(count1 == counter)
            break;

            for(int i = colLeft ; i <= colRight ; i++){
               demo.add(matrix[rowTop][i]);
               count1++;
            }
            rowTop++;

            if(count1 == counter)
            break;
            
            for(int i = rowTop ; i <= rowBottom ; i++){
                demo.add(matrix[i][colRight]);
                count1++;
            }
            colRight--;

            if(count1 == counter)
            break;
            
            // System.out.println(colRight + " " + colLeft);
             for(int i = colRight ; i >= colLeft ; i--){
                demo.add(matrix[rowBottom][i]);
                // System.out.println("i am in 3rd pointer");
                count1++;
            }
            rowBottom--;

            if(count1 == counter)
            break;
            
             for(int i = rowBottom ; i >= rowTop ; i--){
                demo.add(matrix[i][colLeft]);
                count1++;
            }
            colLeft++;
        }

        System.out.println(demo);
    }
}
