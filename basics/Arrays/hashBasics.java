package Arrays;

//question:
// array = [1,2,3,1,3]
// print frequency of target

import java.util.HashMap;

public class hashBasics {
     
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 1, 3};
        int target = 3;
        int freq = targetFreq(arr, target);
        if(freq == -1){
            System.out.println("Target not found in the array");
        }else{
            System.out.println("Frequency of " + target + " is: " + freq);
        }
    }

    public static int targetFreq(int[] arr, int target){
        int maxEle = 0;
        for(int i=0;i<arr.length;i++){
            maxEle = Math.max(maxEle, arr[i]);
        }
        HashMap<Integer, Integer> map = new HashMap<>(maxEle + 1);
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }
        int freq = -1;
        if(map.containsKey(target)){
             freq = map.get(target);
            }   
            return freq;
    }
}
