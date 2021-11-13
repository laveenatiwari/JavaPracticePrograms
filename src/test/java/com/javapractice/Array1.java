package com.javapractice;

import java.util.Scanner;

public class Array1 {
public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numOfInput = sc.nextInt();
        for(int j=0;j<numOfInput;j++){
            String even =" ";
            String odd =" ";
        String input = sc.next();
        char[] inputArray = input.toCharArray();
        for (int i =0 ; i<input.length();i++){
            if(i %2==0){
                even +=inputArray[i];
            }
            else{
                odd +=inputArray[i];
            }
            }
            System.out.println(even + " " +odd);
    }
         }
    }

