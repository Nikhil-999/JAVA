public class Array2DinJava {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        arr[0][0] = 2;
        arr[0][1] = 4;
        arr[0][2] = 10;
        arr[1][0] = 6;
        arr[1][1] = 3;
        arr[1][2] = 20;


        for(int i = 0 ; i<2 ; i++){
            for(int j = 0 ; j<3 ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        myFunc(arr);
    }

    static void myFunc(int[][] arr){

        for(int i = 0 ; i<3 ; i++){
            if(i%2 == 0){
                for(int j = 0 ; j<2 ; j++)
                    System.out.print( arr[j][i] + " ");
            }   
            else{
                for(int j = 1 ; j>=0 ; j--)
                    System.out.print( arr[j][i] + " ");
            }         
        }
    }
}
