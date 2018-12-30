package com.stackroute.practcice4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFind {
    public static  boolean verifyRegex(String s){
        boolean ret = false;
        Pattern pattern = Pattern.compile("Harry");
        Matcher m = pattern.matcher(s);
        if(m.find()){
            ret = true;
        }
        else{
            ret = false;
        }
        return  ret;
    }

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");

        String s = scan.nextLine();
        boolean res = verifyRegex(s);
        System.out.println(res);

    }
}
