package cst1201;

import java.util.Random;
import java.util.Scanner;

public class RandomGenerator {

    public static void main(String[] args) {
        //TODO: Create a Scanner object to read keyboard input.
        Scanner sc = new Scanner(System.in);

        //TODO: Ask the user a lower and upper bound.
        System.out.print("Enter a lower bound number: ");
        int low = sc.nextInt();
        int minm = low;

        //TODO: Ask the user a upper bound.
        System.out.print("Enter an upper bound number: ");
        int up = sc.nextInt();

        //TODO: Ask the user for the number of random integers to generate.
        System.out.print("Enter the number of random integers to generate: ");
        int numRan = sc.nextInt();

        int sum = 0;
        double avrg = 0.0;
        int maxm = 0;

        //TODO: Generate random integers of the desired length and bound.
        for (int i = 0; i < numRan; i++) {
            Random random = new Random();
            int num = random.nextInt((up - low) + 1) + low;
            System.out.println(num);
            avrg = avrg + num;
            sum = sum + num;
            //sum
            if (maxm < num) {       //maximum
                maxm = num;
            }

            for (int j = 0; j < maxm; j++) {
                if (num < low) {
                    low++;
                    minm = low;      //minimum
                }
            }
        }

        //average
        avrg = avrg / numRan;

        //TODO: Print the average, max, min, count, and sum of the integers.
        System.out.println("Average is         : " + avrg);
        System.out.println("Sum is             ：   " + sum);
        System.out.println("Num of integer is  : " + numRan);//Count
        System.out.println("Minimum is         : " + minm);
        System.out.println("Maximum is         : " + maxm);
    }
}
