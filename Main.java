package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i <5; i++) {
            System.out.println("Ingrese numero");
            int num = input.nextInt();
            numbers[i] = num;

        }

        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            suma = suma + numbers[i];
        }
        System.out.println(suma/ numbers.length);
    }
}
