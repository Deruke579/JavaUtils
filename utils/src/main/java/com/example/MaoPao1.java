package com.example;

import java.util.Random;

/**
 * Created by Kelly on 2019/3/19.
 */
public class MaoPao1 {

    public static void main(String[] args){
        int[] array = new int[10];
        for (int i=0;i<10;i++)
            array[i] = (int) (Math.random()*100);
        for(int i= 0;i < array.length-1;i++){
            for(int j= 0;j < array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int tmp= array[j];
                    array[j]= array[j+1];
                    array[j+1]= tmp;
                }
            }
        }
        int sum=0 ;
        for(int i= 0;i < array.length;i++){
            System.out.println(array[i]);
            sum +=  array[i];

        }
        System.out.println("大:"+array[9]);
        System.out.println("大:"+array[0]);
        System.out.println(sum);
        System.out.println(sum/10);
    }




}

