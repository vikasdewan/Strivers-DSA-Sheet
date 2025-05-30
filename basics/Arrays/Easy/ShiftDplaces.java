//https://takeuforward.org/plus/dsa/problems/left-rotate-array

package Arrays.Easy;
import java.util.Arrays;

public class ShiftDplaces{
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        int[] result = shiftElements(arr, 2, "left");
        System.out.println(Arrays.toString(result));
        int[] result1 = shiftElements(arr, 2, "right");
        System.out.println(Arrays.toString(result1));
        int[] temp = {1,2,3,4,5};
        int[] result2 = shiftElementsRec(arr, temp, 2, 0, "left");
        System.out.println(Arrays.toString(result2));
    }

    public static int[] shiftElements(int arr[],int d , String shift){
         int n = arr.length;
         int[] newArr = new int[n];
         int[] temp = arr;

         for(int i=0;i<n ;i++){
            if(shift.equals("left")){
                newArr[i]=temp[(i+d)%n];
            }else if(shift.equals("right")){
                newArr[i] = temp[(i-d+n)%n];
            }
         }
            return newArr;
    }

    //recursive
    public static int[] shiftElementsRec(int arr[],int[] temp,int d,int i, String shift){

            if(i==arr.length){
                return arr;
            }

            if(shift.equals("left")){
                arr[i]=temp[(i+d)%arr.length];
                 return shiftElementsRec(arr,temp, d, i+1, shift);
            }else if(shift.equals("right")){
                arr[i] = temp[(i-d+arr.length)%arr.length];
              return  shiftElementsRec(arr,temp, d, i+1, shift);
            }
            return arr;
    }
}