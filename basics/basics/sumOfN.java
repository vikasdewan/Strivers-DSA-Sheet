package basics;

public class sumOfN {
    
    public static void main(String[] args) {
        int n = 5;
     System.out.print("Sum of first " + n + " numbers is: ");
        sumOfNum(n, 0);
    }
    public static void sumOfNum(int n , int sum){
        if(n==0){
            System.out.println(sum);
        }
         else{
            sumOfNum(n-1, sum+n);}
    }
}
