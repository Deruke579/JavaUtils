package com.example;

/**
 * Created by Kelly on 2019/3/29.
 */
public class FindString {
    public static void main(String[] args) {
        String str= "12ABC456ABCbc";
        String str2 = "ABC";
        for(int i=0;i<str.length()-str2.length();i++){
            if(str2.equals(str.substring(i,str2.length()+i))){
                System.out.println(i);
            }
        }
    }
}
