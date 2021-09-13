package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 *Copyright 2021 Daniela Gomez-Dugan
 */
public class BMI
{
    public static void main(String[] args)
    {
        // Program to calculate user's BMI
        Scanner input = new Scanner(System.in);
        String prompt;

        System.out.print("What is your height in inches? ");
        double height = input.nextDouble();

        System.out.print("What is your weight in pounds? ");
        double weight = input.nextDouble();

        double bmi = calculcateBMI(height, weight);

        System.out.printf("Your BMI is %.1f.\n", bmi);

        // Deciding what prompt to print depending on BMI range
        if (bmi < 18.5)
            System.out.print("You are under the ideal weight range.");
        else if (bmi > 25)
            System.out.print("You are over the ideal weight range.");
        else
            System.out.print("You are within the ideal weight range.");
    }

    // Program to calculate the BMI
    public static double calculcateBMI(double height, double weight)
    {
        double one = height * height;
        double two = weight / one;
        return two * 703.0;
    }

}

