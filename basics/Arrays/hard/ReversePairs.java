package Arrays.hard;
import java.util.*;

import sorting.mergeSort;

public class ReversePairs {
    
    public static void main(String[] args) {
        
        int[] arr = {5,4,4,3,3};
        System.out.println(countRevPairs(arr));
        System.out.println(team(arr, arr.length));
    }

    public static int countRevPairs(int[] arr){
        int count = 0;

        for(int i = 0 ;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] > (2*arr[j])){
                    count++;
                }
            }
        }
        return count;
    }

    //optimal solution
    public static int team(int[] arr , int n){
        return mergeSort(arr,0 , n-1);
    }

    public static int mergeSort(int[] arr , int low , int high){
        int count = 0;
        if(low>= high) return count;
        int mid = (low + high)/2;
        count += mergeSort(arr, low , mid);
        count += mergeSort(arr, mid+1 , high);
        count += countPairs(arr,low , mid , high);
        merge(arr, low , mid , high);
        return count;
    }

    public static int countPairs(int[] arr, int low , int mid , int high){
        int count = 0;
        int right = mid+1;
        for(int i = 0;i<=mid;i++){
            while(right <= high && arr[i] > 2*arr[right]) right++;
            count += (right - (mid +1));
        }   
        return count;
    }

    public static void merge(int[] arr ,int low ,int mid , int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while(left<=mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=mid){
            temp.add(arr[right]);
            right++;
        }
    }
}
