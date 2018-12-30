package com.stackroute.practcice4;

import java.util.Scanner;

public class StringTranspose {

    public static String transpose(String s){

        String[] split = s.split(" ");

        String strnew = "";

        for(int i=0;i<split.length;i++){
            for(int j=split[i].length()-1;j>=0;j--){
                strnew = strnew.concat(Character.toString(split[i].charAt(j)));
            }
            split[i] = strnew;
            strnew = "";
        }
        String retstr = "";
        for(int i=0;i<split.length;i++){
            retstr = retstr + split[i] + " ";
        }

        return retstr.trim();
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = scan.nextLine();

        String str = transpose(s);
        System.out.println(str);
    }
}
