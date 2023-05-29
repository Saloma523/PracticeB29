package day15;

import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("Enter a number:");
            int number = input.nextInt();

            if(number <0){
                break;
            }
            sum += number;
        }
        System.out.println(sum);
        input.close();
    }
}
/*

Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
 */