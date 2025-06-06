package Arrays.hard;

public class MaxProductSubArray {
   
    public static void main(String[] args) {
        
        int[] arr  = {4, 5, 3, 7, 1, 2};
        System.out.println(max(arr));
        System.out.println(maxProductSubArray(arr));
    }

    public static int max(int[] arr){
        int ptr = 0;
        int maxProduct = 0;
        int currProduct = 1;
        while(ptr < arr.length){
            if(arr[ptr]>0){
                currProduct *= arr[ptr];
            }else{
                currProduct=0;
            }
            maxProduct = Math.max(maxProduct, currProduct);
            ptr++;
        }
        return maxProduct;
    }


    //optimal
    public static int maxProductSubArray(int arr[]) {
    int prod1 = arr[0],prod2 = arr[0],result = arr[0];
    
    for(int i=1;i<arr.length;i++) {
        int temp = Math.max(arr[i],Math.max(prod1*arr[i],prod2*arr[i]));
        prod2 = Math.min(arr[i],Math.min(prod1*arr[i],prod2*arr[i]));
        prod1 = temp;
        
        result = Math.max(result,prod1);
    }
    
    return result;
	}
}
