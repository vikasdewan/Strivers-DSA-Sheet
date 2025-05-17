package basics;

import java.util.*;

public class getAllDivisors {

    public static void main(String[] args) {
        int n = 7;
        ArrayList<Integer> divisors = new ArrayList<>();    
        divisors = getDivisors(n, divisors);
        System.out.println("Divisors of " + n + " are: " + divisors);
    }

    public static ArrayList<Integer> getDivisors(int n, ArrayList<Integer> divisors) {
        int temp = (int)Math.sqrt(n); // cast sqrt to int
        for (int i = 1; i <= temp; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        return divisors;
    }
}
