//input and output in java

import java.util.Scanner;                           

public class InOutput {
    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your height: ");
        float height = sc.nextFloat();
        
        // output
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your height is: " + height);
    }
}