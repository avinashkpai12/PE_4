package com.stackroute.practcice4;

import java.util.Scanner;

public class ReplaceChar{
    public static String replace(String s) {

        s = s.replaceAll("d", "f");
        s = s.replaceAll("l", "t");

        return s;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scan.nextLine();
        String newS = replace(s);
        System.out.println(newS);
    }
}
