package Arrays.Easy;

import java.util.ArrayList;

public class FindTheUnion {
    
    public static void main(String[] args) {
        
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {3,4,5,6,7};
        findUnion(arr1, arr2);
        int[] arr3 = {1,2,3,4,5};
        int[] arr4 = {1,2,3,4,5};
        findUnion(arr3, arr4);
        int[] arr5 = {1,2,3,4,5};
        int[] arr6 = {6,7,8,9,10};
        ArrayList<Integer> list = new ArrayList<>();
        findUnionRec(arr5, arr6, list, 0, 0);
    }

    public static void findUnion(int arr1[], int arr2[]){
        int arr1Pointer = 0;
        int arr2Pointer = 0;
        ArrayList<Integer> list = new ArrayList<>(arr1.length + arr2.length);
        while(arr1Pointer < arr1.length && arr2Pointer < arr2.length){
            if(arr1[arr1Pointer]==arr2[arr2Pointer]){
                if(!list.contains(arr1[arr1Pointer])) {
                    list.add(arr1[arr1Pointer]);
                }
                arr1Pointer++;
                arr2Pointer++;
            }else{

                if(arr1[arr1Pointer] < arr2[arr2Pointer]){
                    if(!list.contains(arr1[arr1Pointer])) {
                        list.add(arr1[arr1Pointer]);
                    }
                    arr1Pointer++;
                }else{
                    if(!list.contains(arr2[arr2Pointer])) {
                        list.add(arr2[arr2Pointer]);
                    }
                    arr2Pointer++;
                }
            }
        }
        while(arr1Pointer < arr1.length){
            if(!list.contains(arr1[arr1Pointer])) {
                list.add(arr1[arr1Pointer]);
            }
            arr1Pointer++;
        }
        while(arr2Pointer < arr2.length){
            if(!list.contains(arr2[arr2Pointer])) {
                list.add(arr2[arr2Pointer]);
            }
            arr2Pointer++;
        }

        System.out.println(list);
    }

    //recursive
    public static void findUnionRec(int arr1[], int[] arr2 , ArrayList<Integer> list , int arr1Pointer , int arr2Pointer){
        if(arr1Pointer == arr1.length || arr2Pointer == arr2.length){
            while(arr1Pointer < arr1.length){
                if(!list.contains(arr1[arr1Pointer])) {
                    list.add(arr1[arr1Pointer]);
                }
                arr1Pointer++;
            }
            while(arr2Pointer < arr2.length){
                if(!list.contains(arr2[arr2Pointer])) {
                    list.add(arr2[arr2Pointer]);
                }
                arr2Pointer++;
            }
            System.out.println(list);
            return;
        }

        if(arr1[arr1Pointer] == arr2[arr2Pointer]){
            if(!list.contains(arr1[arr1Pointer])) {
                list.add(arr1[arr1Pointer]);
            }
            findUnionRec(arr1, arr2, list, arr1Pointer+1, arr2Pointer+1);}
        else if(arr1[arr1Pointer] < arr2[arr2Pointer]){
            if(!list.contains(arr1[arr1Pointer])) {
                list.add(arr1[arr1Pointer]);
            }
            findUnionRec(arr1, arr2, list, arr1Pointer+1, arr2Pointer);
        }
        else{
            if(!list.contains(arr2[arr2Pointer])) {
                list.add(arr2[arr2Pointer]);
            }
            findUnionRec(arr1, arr2, list, arr1Pointer, arr2Pointer+1);
        }
    }
}
