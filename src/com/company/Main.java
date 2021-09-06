package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        // write your code here

        startCalculator();

    }

    public static void startCalculator() {

        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        String type = "";
        int result = 0;

        System.out.println("This is the calculator you lazy ass!\n" +
                "I will do all the shit you cant do: addition, subtraction, division and multiplication.!");

        for (int i = 0; i < 4; i++) {

            while(true){

                int operation;

                System.out.println("What do you want? or what dont you know: \n" +
                        "1. Addition\n" +
                        "2. Substraction\n" +
                        "3. Division\n" +
                        "4. Multiplication\n");

                operation = input.nextInt();

                if (operation < 1 || operation > 4){
                    System.out.println("Pick one allready, will you!:");
                }

                System.out.println("Then give me the damned number!");
                number1 = input.nextInt();

                System.out.println("And then what?");
                number2 = input.nextInt();

                switch (operation) {
                    case 1:
                        result = number1 + number2;
                        type = "Addition";
                        break;
                    case 2:
                        result = number1 - number2;
                        type = "Substraction";
                        break;
                    case 3:
                        result = number1 / number2;
                        type = "Division";
                        break;
                    case 4:
                        result = number1 * number2;
                        type = "Multiplication";
                        break;
                    default:
                        result = 0;
            }
                System.out.println("Learn math you moron! but the result is " + result);
            }
            }
    }
}
