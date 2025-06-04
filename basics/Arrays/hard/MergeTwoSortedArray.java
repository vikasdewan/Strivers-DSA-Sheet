package Arrays.hard;
import java.util.*;

public class MergeTwoSortedArray {
    
    public static void main(String[] args) {
        
        int[] num1 = {-5,-2,4,5};
        int[] num2 = {-3,1,8};

        merge(num1, num1.length, num2, num2.length);

        long[] arr1 = {1, 4, 8, 10};
        long[] arr2 = {2, 3, 9};
        int n = 4, m = 3;
        mergeOptimal1(num1, m, num2, n);
        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\narr2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    
    }

    public static void merge(int[] num1 ,int m, int[] num2 , int n){
        int[] result = new int[m+n];

        int num1Ptr = 0;
        int num2Ptr = 0;
        int resultIdx = 0;
        while(num1Ptr<m && num2Ptr<n){
            if(num1[num1Ptr]<=num2[num2Ptr]){
                result[resultIdx] = num1[num1Ptr];
                num1Ptr++;
            }else{
                result[resultIdx] = num2[num2Ptr];
                num2Ptr++;
            }
            resultIdx++;
        }
        while(num1Ptr<m){
            result[resultIdx++] = num1[num1Ptr++];
        }
        
        while(num2Ptr<n){
            result[resultIdx++] = num2[num2Ptr++];
        }
        
        System.out.println(Arrays.toString(result));
    }


    //optimal approach 1
    public static void mergeOptimal1(int[] num1 , int m , int[] num2 , int n){
        int left = m-1;
        int right = 0;

        while(left>=m && right < n){
            if(num1[left]>num2[right]){
                long temp = num1[left];
                num1[left] = num2[right];
                num2[right] = (int)temp;
                left--;
                right++;
            }else{
                break;
            }
        }
        Arrays.sort(num1);
        Arrays.sort(num2);

        

    }

    //optimal 2
     public static void swapIfGreater(long[] arr1, long[] arr2, int ind1, int ind2) {
        if (arr1[ind1] > arr2[ind2]) {
            long temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }

    public static void merge(long[] arr1, long[] arr2, int n, int m) {

        // len of the imaginary single array:
        int len = n + m;

        // Initial gap:
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {
            // Place 2 pointers:
            int left = 0;
            int right = left + gap;
            while (right < len) {
                // case 1: left in arr1[]
                //and right in arr2[]:
                if (left < n && right >= n) {
                    swapIfGreater(arr1, arr2, left, right - n);
                }
                // case 2: both pointers in arr2[]:
                else if (left >= n) {
                    swapIfGreater(arr2, arr2, left - n, right - n);
                }
                // case 3: both pointers in arr1[]:
                else {
                    swapIfGreater(arr1, arr1, left, right);
                }
                left++; right++;
            }
            // break if iteration gap=1 is completed:
            if (gap == 1) break;

            // Otherwise, calculate new gap:
            gap = (gap / 2) + (gap % 2);
        }
    }
}
