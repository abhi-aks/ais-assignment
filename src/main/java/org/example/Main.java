package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in, "UTF-8");

        // Get user input for loan amount
        System.out.print("Enter Loan Amount: ");
        double loanAmount = scanner.nextDouble();

        // Get user input for annual interest rate
        System.out.print("Enter Annual Interest Rate (%): ");
        double annualInterestRate = scanner.nextDouble();

        // Get user input for loan term in months
        System.out.print("Enter Loan Term (in months): ");
        int loanTermInMonths = scanner.nextInt();

        // Calculate monthly payment using the calculateMonthlyPayment method
        double monthlyPayment = calculateMonthlyPayment(loanAmount, annualInterestRate, loanTermInMonths);

        // Display the result
        System.out.printf("Monthly Payment: %.2f%n", monthlyPayment);

        //Display the total DebtAmount
        System.out.println("Total Debt Amount: "+ monthlyPayment*loanTermInMonths);

        // Close the Scanner
        scanner.close();
    }

    // Method to calculate monthly payment
    static double calculateMonthlyPayment(double loanAmount, double annualInterestRate, int loanTermInMonths) {
        // Calculate monthly interest rate and total number of payments
        double a = Math.pow(1 + annualInterestRate / 12 / 100, loanTermInMonths);
        // Calculate monthly payment using the loan amortization formula
        return loanAmount * (annualInterestRate / 12 / 100 * a) /(a - 1);


    }
}