package sorting;

public class bubble {
    
    public static void main(String[] args) {
        
        int arr[] = {5, 4, 3, 2, 1,454,34,554,767,33,66,23};
        int n = arr.length;
        bubbleSortRec(arr, n);
         
    }

    public static void bubbleSort(int arr[], int n){
       
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        
    }

    public static void bubbleSortRec(int arr[], int n){
        if(n==1){
            display(arr);
            return;
        }
        for(int j=0;j<n-1;j++){
            if(arr[j] > arr[j+1]){
                swap(arr, j, j+1);
            }
        }
        bubbleSortRec(arr, n-1);
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
