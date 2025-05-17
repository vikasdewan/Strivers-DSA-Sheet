package basics;

public class CheckPrime {
 
    public static void main(String[] args) {
        
        int n = 11;
        boolean isPrime = isPrime(n);
        if(isPrime){
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

    public static boolean isPrime(int n){
        if(n<= 1){
            return false;
        }
        if(n== 2){
            return true;
        }
        if(n%2==0){
            return false;
        }

        int temp = (int)Math.sqrt(n); // cast sqrt to int
        for(int i=3; i<=temp; i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
