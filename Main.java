
package com.company;

import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	boolean[] numbers = new boolean[9];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i <9; i++) {
            Random rd = new Random();
            numbers[i] = rd.nextBoolean();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
