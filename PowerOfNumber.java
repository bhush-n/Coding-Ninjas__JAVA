package com.codelost;

import java.util.Scanner;
public class PowerOfNumber {

    public static void main(String[] args) {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int temp=1;
        int n=sc.nextInt();

        while(n!=0)
        {
            temp=temp*x;
            n--;
        }

        System.out.println(temp);
    }
}