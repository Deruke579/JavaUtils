package com.example;

/**
 * Created by Kelly on 2019/3/19.
 */
public class MaoPao {

    public static void main(String[] args){

        int[] array = {1,2,5,0,8,3,9};
        for(int i= 0;i < array.length-1;i++){
            for(int j= 0;j < array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int tmp= array[j];
                    array[j]= array[j+1];
                    array[j+1]= tmp;
                }
            }
        }
        for(int i= 0;i < array.length;i++){
            System.out.println(array[i]);
        }
    }




}

