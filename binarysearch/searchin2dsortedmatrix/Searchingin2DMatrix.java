package binarysearch.searchin2dsortedmatrix;

public class Searchingin2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int numRows = matrix.length;
        int numColumns = matrix[0].length;

        int left = 0, right = numRows * numColumns - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            // Convert mid to row and column
            int row = mid / numColumns;
            int col = mid % numColumns;

            int midElement = matrix[row][col];

            if (midElement == target) {
                return true;
            } else if (midElement < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 3;

        System.out.println(searchMatrix(matrix, target)); // Output: true

        target = 13;
        System.out.println(searchMatrix(matrix, target)); // Output: false
    }
}
