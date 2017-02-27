package com.company;

/**
 * Created by Yin on 2/23/2017.
 */
public class euclidad {
    public static int gcd(int a, int b)
    {
        if(b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}
