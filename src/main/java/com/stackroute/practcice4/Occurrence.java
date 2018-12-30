package com.stackroute.practcice4;

import java.util.Scanner;

public class Occurrence {

    public static int countOccurrence(String s, char c, int i){

       /* String str = s.replaceAll(Character.toString(c), "");

        int len = s.length() - str.length();

        return len;*/
       int count = 0;
       if(i == s.length()){
           return count;
       }
       if(s.charAt(i) == c){
           count = 1 + countOccurrence(s, c, ++i);
       }
       else {

          count = countOccurrence(s, c, ++i);
       }
       return count;
    }

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scan.nextLine();
        System.out.println("Enter the character to be replaced : ");
        String c = scan.next();

        int n = countOccurrence(s, c.charAt(0), 0);
        System.out.println(n);


    }
}
