package Lec3;

public class SearchInRowNColumnWiseSorted {

    public static void main(String[] args) {
        
        int[][] arr = {{1,3,11},{5,7,14},{10,12,18}};
        int target = 10;
        System.out.println(search(arr, target));
    }
    
    public static boolean search(int[][] arr ,int target){
        int n = arr.length;
        int m = arr[0].length;
        int row = 0; 
        int col = m-1;

        while(row < n  && col >= 0){
            if(arr[row][col] == target) return true;
            else if ( arr[row][col] < target) row++;
            else col--;
        }
        return false;
    }

}
