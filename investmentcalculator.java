/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Etob media
 */
import java.util.Scanner;
public class investmentcalculator {
  public static void main(String[] args) {
      // entering new principal amounts, interestrates, duration to be scanned
        Scanner scanner = new Scanner(System.in);
        System.out.print("insert number of members: ");
        int numMembers = scanner.nextInt();
        double[] principalAmounts = new double[numMembers];
        double[] interestRates = new double[numMembers];
        int[] durations = new int[numMembers];
        
        for (int i = 0; i < numMembers; i++) {
            // input  for principal amounts for memebers
            System.out.println("Enter principal amount for member " + (i + 1) + ":");
            principalAmounts[i] = scanner.nextDouble();
            // nput for interest rates for memebers
            System.out.println("Enter interest rate for member " + (i + 1) + " (in percentage):");
            interestRates[i] = scanner.nextDouble();
            // input for duration for memebers
            System.out.println("Enter duration (in years) for member " + (i + 1) + ":");
            durations[i] = scanner.nextInt();
        }
        
        // Calculate  the value of investment after the time frame elapses
        System.out.println("Value of investments after the time frame elapses:");
        for (int i = 0; i < numMembers; i++) {
            double value = principalAmounts[i] * (1 + interestRates[i] / 120) * durations[i];
            System.out.println("Member " + (i + 1) + ": " + value);
        }
        
        // Reset scanner
        scanner.close();
    }
  
}
