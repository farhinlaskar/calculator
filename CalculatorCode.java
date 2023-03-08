package FirstMiniAssignment;

import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.lang.Math;

public class CalculatorCode {

	public static void main(String[] args) {
    
       
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the numbers: ");
       
       double num1 = sc.nextDouble();
       double num2 = sc.nextDouble();
       
       System.out.println("Enter the operator(+,-,*,/): ");
       
       char op = sc.next().charAt(0);
       
       double o = 0;
       
       switch (op) {
       
       // case to add two numbers
       case '+':

           o = num1 + num2;

           break;

       // case to subtract two numbers
       case '-':

           o = num1 - num2;

           break;

       // case to multiply two numbers
       case '*':

           o = num1 * num2;

           break;

       // case to divide two numbers
       case '/':

           o = num1 / num2;

           break;

       default:

           System.out.println("You enter wrong input");

            
       }
       
       System.out.println("The final result:");
       
       System.out.println();
       
       System.out.println(num1+ " " + op + " " + num2 + " = " +o);
	}

}
