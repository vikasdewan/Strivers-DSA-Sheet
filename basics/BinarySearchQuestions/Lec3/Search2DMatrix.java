package Lec3;

import java.util.ArrayList;

public class Search2DMatrix {
    
    public static void main(String[] args) {
        
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 10;
        System.out.println(searchMatrix(mat, target));
    }


    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        //apply binary search:
        int low = 0, high = n * m - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / m, col = mid % m;
            if (matrix[row][col] == target) return true;
            else if (matrix[row][col] < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }

}
