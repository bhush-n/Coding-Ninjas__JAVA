package com.codelost;

import java.util.Scanner;

public class FahToCel {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int f = s.nextInt();
//        int cel = (5/9)*(f-32);

        int cel = (5*(f-32))/9;
        System.out.println(cel);
    }
}
