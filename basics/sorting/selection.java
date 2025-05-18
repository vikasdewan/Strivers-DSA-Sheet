package sorting;

public class selection {
    
    public static void main(String[] args) {
        
        int arr[] = {5, 4, 3, 2, 1};
        int n = arr.length;
        selectionSort(arr, n);
    }

    public static void selectionSort(int arr[], int n){
        if(n==0){
            display(arr);
            return;
        }
        int maxEleIdx = 0;
        int maxIdx = n-1;
        for(int i=0;i<n ;i++){
            if(arr[i]> arr[maxEleIdx]){
                maxEleIdx = i;
            }
        }

        swap(arr, maxEleIdx, maxIdx);
        selectionSort(arr, n-1);
    }

    public static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
