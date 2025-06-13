package Lec2;

public class SqrtOfNum {
    
    public static void main(String[] args) {
        
        int n = 9;
        System.out.println(sqrt(n));
        System.out.println(floorSqrt(n));
        System.out.println(floorSqrtOpt(n));
    }

    public static int sqrt(int n){
    
    int ans = 0;
    for(long i = 1;i<=n/2;i++){
        long val = i * i;
        if(val <= (long) n){
            ans =  (int)i;
        }else{
            break;
        }
    }
    return ans;
    }


    //optimal 1
    public static int floorSqrt(int n){
        int ans = (int) Math.sqrt(n);
        return ans;
    }

    //optimal 2
    public static int floorSqrtOpt(int n){
        int low = 1; 
        int high = n;
        while(low<=high){
            long mid = low + (high-low)/2;
            long val = mid * mid;
            if(val <= (long)n){
                low = (int) mid+1;
            }else{
                high = (int) mid -1;
            }
        }
        return high;
    }
}
