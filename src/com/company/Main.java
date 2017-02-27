package com.company;
import java.util.*;
import static com.company.euclidad.gcd;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String ab;
        Scanner nm = new Scanner(System.in);
        System.out.println("Welcome to the GREATEST and the BEST GCD generator");
        do
        {
            System.out.println("Enter your first number");
            int a = nm.nextInt();
            System.out.println("Enter your second number");
            int b = nm.nextInt();
            int num = gcd(a, b);
            System.out.println(a + " and " + b + " greatest divisor is " + num);
            System.out.println();
            System.out.println("Would you like to enter another one?");
            ab = nm.next();
        } while (ab.equalsIgnoreCase("yes"));

    }
}
