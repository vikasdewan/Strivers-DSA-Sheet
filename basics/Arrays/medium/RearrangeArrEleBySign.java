package Arrays.medium;
import java.util.*;

public class RearrangeArrEleBySign {
    
    public static void main(String[] args) {
        int[] arr = {1,-1,-3,-4,2,3};
        int[] result =  rearrangeArr(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] rearrangeArr(int[] arr){
        int[] Temp = new int[arr.length];
        int L = 0;
        int R = 1;
        int idx = 0;
        while(idx < arr.length){
            if(arr[idx]>=0){
                Temp[L] = arr[idx];
                L += 2;
            }
            else{
                Temp[R] = arr[idx];
                R += 2;
            }
            idx++;
        }
        return Temp;
    }
}
