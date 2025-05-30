package Arrays.medium;
import java.util.*;

public class MatrixRotate90Deg{
    public static void main(String[] args) {
        
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] ans = rotate(arr);
        for(int i = 0;i<ans.length;i++){
            for(int j = 0; j<ans[0].length;j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }


    //brute force 
    public static int[][] rotator(int[][] arr){
        int[][] newArr = new int[arr.length][arr[0].length];
        for(int i = 0;i<arr.length ;i++){
            for(int j = arr[0].length-1 ;j>=0;j--){
                newArr[i][arr[0].length-j-1] = arr[j][i];
            }
        }
        return newArr;
    }

    //optimal
    static int[][] rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
        return matrix;
    }
}
