package com.eg.java;

import java.util.Scanner;

public class Main{

       public static void main(String[] args){
                 Scanner scan= new Scanner(System.in);
                 System.out.print("Enter no.1:");
                 double n1= scan.nextDouble();
                 System.out.print("Enter no.2:");
                 double n2= scan.nextDouble();
                 double output= n1+n2;
                 System.out.print("Result"+output);
       }
}
