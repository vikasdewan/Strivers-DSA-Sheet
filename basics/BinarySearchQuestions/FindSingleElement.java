package BinarySearchQuestions;
import java.util.*;

public class FindSingleElement {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,5,5,6,6));
        System.out.println(findSingle(list));
    }

    public static int findSingle(ArrayList<Integer> arr){
        int n = arr.size();
        if(n==1){
            return arr.get(0);
        }
        if(!arr.get(0).equals(arr.get(1))){
            return arr.get(0);
        }
        if(!arr.get(n-1).equals(arr.get(n-2))){
            return arr.get(n-1);
        }

        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(!arr.get(mid).equals(arr.get(mid-1)) && !arr.get(mid).equals(arr.get(mid+1))){
                return arr.get(mid);
            }
            else if(
                (mid%2==1 && arr.get(mid).equals(arr.get(mid-1))) || 
                (mid%2 ==0 && arr.get(mid).equals(arr.get(mid+1)))
            ){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}
