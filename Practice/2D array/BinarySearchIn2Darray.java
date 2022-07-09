public class BinarySearchIn2Darray {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        boolean found = searchMatrix(matrix,3);
        if(found){
            System.out.println("Found in the 2D array.");
        }
        else{
            System.out.println("NOT Found in the 2D array.");
        }
    }

    static boolean searchMatrix(int[][] matrix , int target){
        int row = matrix.length , col = matrix[0].length;
        int start = 0 , end = row*col - 1;
        int mid = start + (end - start)/2;
        while(start <=  end){
            if(matrix[mid/col][mid%col] == target)
            return true;

            if(matrix[mid/col][mid%col] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
            mid = start + (end - start)/2;
        }
        return false;
    }

}
