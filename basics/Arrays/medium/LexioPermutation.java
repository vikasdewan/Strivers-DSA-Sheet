package Arrays.medium;
import java.util.*;

public class LexioPermutation {
    
    public static void main(String[] args) {
        
        int[] arr = {1, 3,5,4,2};
        getPermutation(arr);
    } 

    public static void getPermutation(int[] arr) {
    int n = arr.length;
    int ind = -1;

    // Step 1: Find the first index from the end where arr[i-1] < arr[i]
    for (int i = n - 1; i > 0; i--) {
        if (arr[i - 1] < arr[i]) {
            ind = i;
            break;
        }
    }

    if (ind == -1) {
        // Whole array is in descending order → last permutation
        reverse(arr, 0, n - 1);
        return;
    }

    int x = ind - 1; // index to be swapped
    int smallestGreaterIndex = -1;

    // Step 2: Find the smallest element greater than arr[x] from the end
    for (int i = n - 1; i >= ind; i--) {
        if (arr[i] > arr[x]) {
            smallestGreaterIndex = i;
            break;
        }
    }

    // Step 3: Swap
    int temp = arr[x];
    arr[x] = arr[smallestGreaterIndex];
    arr[smallestGreaterIndex] = temp;

    // Step 4: Reverse the suffix
    reverse(arr, ind, n - 1);
}

public static void reverse(int[] arr, int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }

    display(arr);
}

public static void display(int[] arr) {
    for (int num : arr) {
        System.out.print(num + " ");
    }
    System.out.println();
}

}
