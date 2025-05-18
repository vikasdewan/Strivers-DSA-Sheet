package sorting;

 
public class insertion {
    
    public static void main(String[] args) {
        
        int arr[] = {5, 4, 3, 2, 1,454,34,554,767,33,66,28};
        insertionSortRec(arr, arr.length);
     
    }

     static void insertionSort(int[] arr){

        for(int i=0;i<=arr.length-2;i++){ // i is less then n-2 because if suppose i=4 then j=i+1=5 which is out of bound situation , that's why i<=n-2
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }


    public static void insertionSortRec(int arr[] , int n){
        if(n==1){
            display(arr);
            return;
        }

        for(int j=n-1;j>0;j--){
            if(arr[j]<arr[j-1]){
                swap(arr, j, j-1);
            }else{
                break;
            }
        }
        insertionSortRec(arr, n-1);
    }
    static void swap(int arr[], int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
