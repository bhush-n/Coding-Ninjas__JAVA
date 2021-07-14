package com.codelost;

import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int i=scan.nextInt();
        int j=scan.nextInt();
        int k=scan.nextInt();

        int si= (i*j*k)/100;
                System.out.println(si);
    }
}
