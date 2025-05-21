package Arrays.Easy;

import java.util.ArrayList;

public class RemoveDuplicates{

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        removeDuplicate(arr);
        ArrayList<Integer> list = new ArrayList<>();
        removeDuplicateRec(arr, arr.length-1, list);
    }

    public static void removeDuplicate(int arr[]){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }

    //recusive
    public static void removeDuplicateRec(int arr[] , int n ,ArrayList<Integer> list){
        if(n==0){
            System.out.println(list);;
            return;
        }
        if(!list.contains(arr[n])){
           list.add(arr[n]);
        }
        removeDuplicateRec(arr, n-1, list);
    }
}