package Lec1;

public class UpperBound {

    public static void main(String[] args) {
        
        int[] arr = {1,2,2,3};
        System.out.println(upperBoundForX(arr, 2));
    }

    public static int upperBoundForX(int[] arr,int x){
        int upperBound = arr.length;

        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int m = s + (e-s) /2;
            if(arr[m] > x){
                upperBound = m;
                e = m-1;
            }else{
                s = m+1;
            }
        }
        return upperBound;
    }
}