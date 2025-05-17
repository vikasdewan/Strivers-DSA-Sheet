package basics;

import java.util.*;
public class Armstrong {
    
    public static void main(String[] args) {
        
        int num = 157;
        boolean result = isArmStrong(num);
        if(result){
            System.out.println(num + " is an Armstrong number");
        }else{
            System.out.println(num + " is not an Armstrong number");
        }
    }

    public static boolean isArmStrong(int num){
        int t1 = num;
        int t2 = num;

        int sum = 0;
        int count = 0;
        while(t1 != 0){
            t1 = t1 / 10;
            count++;
        }
        while(t2 != 0){
            int digit = t2 % 10;
            sum += Math.pow(digit, count);
            t2 = t2 / 10;
        }

        if(sum == num){
            return true;
        }
        return false;
    }
}

