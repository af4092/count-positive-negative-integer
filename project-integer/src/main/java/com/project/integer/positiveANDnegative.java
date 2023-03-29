package com.project.integer;

import java.util.Scanner;

public class positiveANDnegative {
	public static void main(String args[]) {
		
    Scanner input = new Scanner(System.in); // Scanner input is defined
    int NUMBER_OF_POSITIVES = 0;
    int NUMBER_OF_NEGATIVES = 0;
    int total = 0;
    int countOfNumbers = 0;

    System.out.print("Enter an integer, the input ends if it is 0: ");
    int n = input.nextInt();

    if(n == 0){
    	System.out.println("No numbers are entered except 0");
    	return;
    		}

    while(n != 0){
    	if(n > 0){
    		NUMBER_OF_POSITIVES++;
    	}else{
    		NUMBER_OF_NEGATIVES++;
    	}
    	total += n; 
    	countOfNumbers += 1;
    	n = input.nextInt();
    }

    double average = (double) total / countOfNumbers;

    System.out.println("The number of positives is " + NUMBER_OF_POSITIVES);
    System.out.println("The number of negatives is " + NUMBER_OF_NEGATIVES);
    System.out.println("The total is " + total);
    System.out.println("The average is " + average);
	}
}
