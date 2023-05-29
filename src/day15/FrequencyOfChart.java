package day15;

import java.util.Scanner;

public class FrequencyOfChart {
    public static void main(String[] args) {
          String str = "aabcccd";
        char ch= 'c' ;

      /*  Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        str = input.nextLine();
        System.out.println("Enter a character");
        ch = input.nextLine();
      */

        int count= 0;

        for (int i =0; i< str.length(); i++) {

            if (str.charAt(i) == ch){
                count++;
            }
        }
            System.out.println(count);
    }
       /* Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String
      */
}
/*Create a class named FrequencyOfChar and Write a program
 that asks user to enter a string and a char,
  the returns the frequency of the char from the given string

            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';
                output: 3

                inputs:
                    "Java programming language"
                    'g'
                output: 4
*/