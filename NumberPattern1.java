package com.codelost;
import java.util.Scanner;
public class NumberPattern1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int i=0;
        int j;
        int count;
        while(i<=N)
        {   j=i;
            count=0;
            while(count<i)
            {    System.out.print(j);
                j++;
                count++;
            }
            i++;
            System.out.println();
        }

    }
}
