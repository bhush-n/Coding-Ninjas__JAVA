package com.codelost;
import java.util.Scanner;
public class NumberPattern2  {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int i=0;
        int j;
        int count;
        int space=N-1;
        while(i<=N)
        {   j=i;
            count=0;
            space=N-i;
            while(space>0)
            {
                System.out.print(" ");
                space--;
            }
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