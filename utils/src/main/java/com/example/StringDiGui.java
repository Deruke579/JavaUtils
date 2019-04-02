package com.example;


/**
 * Created by Deruke on 2019/3/31.
 */
public class StringDiGui {

    private static String s = "123456";

    public static void revString(int i, int length) {
        if (i >= length)
            return;
        revString(i + 1, length);
        System.out.print(s.charAt(i));
    }

    public static void main(String[] args) {
       StringDiGui.revString(0,s.length());

    }

}
