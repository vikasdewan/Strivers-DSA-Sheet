package basics;

public class GCD {
    

    public static void main(String[] args) {
        
        int a = 12;
        int b = 8;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }

    public static int gcd(int a , int b){
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    //non recursive method to find GCD
    public static int gcdNonRecursive(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
