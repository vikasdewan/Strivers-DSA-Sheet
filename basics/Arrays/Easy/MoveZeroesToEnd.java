package Arrays.Easy;

import java.util.ArrayList;

public class MoveZeroesToEnd {
    
    public static void main(String[] args) {
        
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        ArrayList<Integer> list = new ArrayList<>();
        moveZeroesRec(arr, list, 0, 0);
    }

    public static void moveZeroes(int arr[]){
        
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                list.add(arr[i]);
            }else{
                count++;
            }
        }
        for(int i=0;i<count;i++){
            list.add(0);
        }
        System.out.println(list);
    }

    //recursive
    public static void moveZeroesRec(int[] arr,ArrayList<Integer> list, int i, int count){
        if(i==arr.length){
            for(int j=0;j<count;j++){
                list.add(0);
            }
            System.out.println(list);
            return;
        }

        if(arr[i] != 0){
            list.add(arr[i]);
            moveZeroesRec(arr, list, i+1, count);
        } else{
            moveZeroesRec(arr, list, i+1, count+1);
        }
    }     
}
