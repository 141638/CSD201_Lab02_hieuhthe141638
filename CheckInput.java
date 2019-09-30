/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd201_lab02_hieuhthe141638;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class CheckInput {
    Scanner sc = new Scanner(System.in);
    
    int CheckInput(int msg){
        int c = 0;
        String Numtext;
        do{
            Numtext = sc.nextLine();
           try{
               if(Numtext.matches("[0-9]*")){
                   c = Integer.parseInt(Numtext);
                   break;
               }
           } 
           catch(ArithmeticException e){}System.out.println("Error!!");
        }
        while(c>=1||c<=4);
        return c;
    }
}
