public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}} ; 
        printMatrix(matrix);
        myfunc(matrix);
        System.out.println();
        printMatrix(matrix);
    }

    static void printMatrix(int[][] matrix){
        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix.length ; j++){
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }

    static void myfunc(int[][] matrix){
        int len = matrix.length;
        int looping = len/2;
        int innerLooping = len;

        int rowTop = 0;
        int rowBottom = len-1;
        int colLeft = 0;
        int colRight = len-1;
        while(looping != 0){
            int temp = 0;
           int i = 1;
           int itr1 = rowTop , itr2 = rowBottom , itc1 = colLeft , itc2 = colRight ;
            while(i<innerLooping){
                // swap(matrix[rowTop][itc1] , matrix[itr1][colRight]);
                temp = matrix[rowTop][itc1];
                matrix[rowTop][itc1] = matrix[itr1][colRight];
                matrix[itr1][colRight] = temp;
                itc1++;
                itr1++;
                i++;
            }
            itc1 = colLeft;
            itr1 = rowTop;
            i=1;

            while(i<innerLooping){
                // swap(matrix[rowTop][itc1] , matrix[itr2][colLeft]);
                temp = matrix[rowTop][itc1];
                matrix[rowTop][itc1] = matrix[itr2][colLeft];
                matrix[itr2][colLeft] = temp;
                itc1++;
                itr2--;
                i++;
            }
            itc1 = colLeft;
            itr2 = rowBottom;
            i=1;

            while(i<innerLooping){
                // swap(matrix[rowBottom][itc2] , matrix[itr2][colLeft]);
                temp = matrix[rowBottom][itc2];
                matrix[rowBottom][itc2] = matrix[itr2][colLeft];
                matrix[itr2][colLeft] = temp;
                itc2--;
                itr2--;
                i++;
            }

            rowTop++;
            rowBottom--;
            colLeft++;
            colRight--;


            innerLooping = innerLooping - 2;
            looping--;
        }
    }
}
