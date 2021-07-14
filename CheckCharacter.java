package com.codelost;

import java.util.Scanner;
public class CheckCharacter{
    public static void main(String args[]){
        char ch;

        Scanner scan=new Scanner(System.in);


        System.out.println("Enter the character  ");
        ch=scan.next().charAt(0);

        if(ch>='A' && ch<='Z'){
            System.out.println(ch+" 1 ");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println(ch+" 0 ");
        }
        else{
            System.out.println(ch+" -1 ");
        }
    }
}
