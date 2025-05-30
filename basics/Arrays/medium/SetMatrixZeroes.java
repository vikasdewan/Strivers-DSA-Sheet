package Arrays.medium;
import java.util.*;

public class SetMatrixZeroes {
    
    public static void main(String[] args) {
        
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] ans = zeroChecker(arr, arr.length, arr[0].length);
        for(int i = 0 ;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //better solution  
    public static int[][] zeroChecker(int[][] arr, int n , int m){
        int[] row = new int[n];
        int[] col = new int[m];

        for(int i=0;i<arr.length;i++){
            for(int j = 0 ;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    row[i] = 1; //marking ith index of row 1
                 col[j] = 1; //marking jth index of col 1
                }
            }
        }

        //finally mark all (i,j) as 0
        //if row[i]  or  col[j] is marked with 1;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0 ;j<arr[0].length;j++){
                if(row[i] == 1 || col[j] == 1){
                    arr[i][j] =0;
                }
            }
        }



        return arr;
    }
}
