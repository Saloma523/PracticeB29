package day15;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int neg = 0;
        int pos =0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter an integer");
            int num = input.nextInt();

            if (num < 0){
                neg++;
            } else if (num > 0) {
                pos++;
            }

        }
        System.out.println(pos +" Positive numbers");
        System.out.println(neg + " Negative numbers");
    }

}
/*
Create a class named PositiveNegative and write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */
