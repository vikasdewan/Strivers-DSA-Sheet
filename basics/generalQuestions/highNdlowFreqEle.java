package generalQuestions;

public class highNdlowFreqEle {
    
    public static void main(String[] args) {
        int arr[] = {10,10,5,15,5,10};
        int n = arr.length;
        highNdLowFreq(arr, n);
    }

    public static void highNdLowFreq(int arr[] , int n){
        int freq[] = new int[n];
        int visited[] = new int[n];
        for(int i=0;i<n;i++){
            freq[i]=1;
            visited[i]=0;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    freq[i]++;
                    visited[j] = -1;
                }
            }
        }

        int max = freq[0];
        int min = freq[0];

        for(int i=0;i<n;i++){
            if(visited[i] != -1){
                if(freq[i]>max){
                    max = freq[i];
                }
                else{
                    min = freq[i];
                }
            }
        }

        for(int i=0;i<n;i++){
            if(visited[i] != -1){
                if(freq[i] == max){
                    System.out.println("Max frequency element is " + arr[i] + " with frequency " + freq[i]);
                }
                else if(freq[i] == min){
                    System.out.println("Min frequency element is " + arr[i] + " with frequency " + freq[i]);
                }
            }
        }
    }
}
