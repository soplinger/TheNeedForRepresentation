package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

            //gather user input
            System.out.println("Input the word you would like to be encrypted: ");
            Scanner kbInput1 = new Scanner(System.in);
            String userInput = kbInput1.next();

        //random point in word
        int randUser = (int)(Math.random()*userInput.length());
        String word2= userInput.substring(randUser)+userInput.substring(0,randUser);

        //starts random percent
        int rand1 = (int)(Math.random()*5);

        //encrypts user input
        for(int j=1;j<=userInput.length();j++)
        {
            String userOutput;
            char out= word2.charAt(j-1);
            if(rand1%5==0){
                userOutput=Integer.toBinaryString(out);
            }
            else if(rand1%5==1){
            userOutput=Integer.toOctalString(out);
            }
            else if(rand1%5==2){
                userOutput=Integer.toString(out);
            }
            else if(rand1%5==3){
                userOutput= Integer.toHexString(out);
            }
            else{
                userOutput = Character.toString(out);
            }
            rand1++;
            System.out.print(userOutput);
        }


    }
}
