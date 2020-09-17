
//  Formula to calculate mortgage

//  M =  P     r ( 1 + r) nth power
//           _____________________

//           (1 + r) nth power - 1

package com.codewithnick;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    // create a scanner object
        Scanner input = new Scanner(System.in);

        //ask user for annual interest rate
        System.out.println("Enter the interest rate");

        // get that interest rate
        double annualInterestRate = input.nextDouble();

        // calculate the monthly interest rate
        double monthlyInterestRate = annualInterestRate /1200;

        // ask user for the amount of years
        System.out.println("Enter the number of years");

        // get that number
        int numberOfYears = input.nextInt();

        // ask the user for the loan amount
        System.out.println("Enter the loan amount");

        // get that number
        double loanAmount = input.nextDouble();

        // calculate monthly payment
        double monthlyPayment = loanAmount * monthlyInterestRate / (1-1 /Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

        // calculate total payment
        double totalPayment = monthlyPayment * numberOfYears * 12;

        // print out monthly payment
        System.out.println("The monthly payment is $" +monthlyPayment * 100 / 100.0);

        // print out total payment
        System.out.println("The total payment is $" +totalPayment * 100 / 100.0);
    }
}
