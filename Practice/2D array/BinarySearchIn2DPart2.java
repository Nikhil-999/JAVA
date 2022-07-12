public class BinarySearchIn2DPart2 {

    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println("\n\n"+searchMatrix(matrix,5)+"\n");
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length - 1;

        while (start <= end) {
            int INstart = 0;
            int INend = matrix[start].length - 1;
            int INmid = INstart + (INend - INstart) / 2;

            while (INstart <= INend) {
                if (matrix[start][INmid] == target)
                    return true;

                if (matrix[start][INmid] < target) {
                    INstart = INmid + 1;
                } else {
                    INend = INmid - 1;
                }
                INmid = INstart + (INend - INstart) / 2;
            }

            start++;

        }

        return false;
    }
}
