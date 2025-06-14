package Lec2;

public class NthRootOfNum {
    
    public static void main(String[] args) {
        
        System.out.println(nthRoot(4, 69));
    }

    public static int nthRoot(int n , int m){
        int low = 1;
        int high = m;
        while(low<= high){
            long mid = low + (high - low) / 2;
            long val = (long) Math.pow(mid, n);
            if(val == m ){
                return (int)mid;
            }else if( val < m){
                low = (int)mid + 1 ;
            }else{
                high = (int)mid - 1 ;
            }
        }
        return -1;
    }
}
