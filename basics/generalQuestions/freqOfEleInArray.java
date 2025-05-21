package generalQuestions;

public class freqOfEleInArray {
 
    public static void main(String[] args) {
        
        int arr[] = {10,5,15,5,10};
        int n = arr.length;
        freqOfEle(arr, n);
        freqOEleRecur(arr, n, 0, new int[n], new int[n]);
    }

    public static void freqOfEle(int arr[], int n){
        int freq[] = new int[n];
        int visited[] = new int[n];
        for(int i=0; i<n;i++){
            freq[i] = 1;
            visited[i] = 0;
        }
        for(int i=0;i<n ;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    freq[i]++;
                    visited[j] = -1;
                }
                
            }
        }
        for(int i=0;i<n ;i++){
            if(visited[i] != -1){
                System.out.println(arr[i] + " " + freq[i]);
            }
        }

    }

    //recursive function 
    public static void freqOEleRecur(int arr[], int n , int i, int freq[], int visited[]){
        if(i == n){
            return;
        }
        freq[i] = 1;
        visited[i] = 0;
        for(int j=i+1;j<n;j++){
            if(arr[i] == arr[j]){
                freq[i]++;
                visited[j] = -1;
            }
            
        }
        freqOEleRecur(arr, n, i+1, freq, visited);
        for(int k=0;k<n ;k++){
            if(visited[k] != -1){
                System.out.println(arr[k] + " " + freq[k]);
            }
        }
    }

}
