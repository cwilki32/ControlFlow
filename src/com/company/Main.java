package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        List<Integer> number = new ArrayList();
        int number1;
        int number2;
        int number3;

        System.out.print("Input first integer: ");
        number1 = input.nextInt();
        System.out.print("Input second integer: ");
        number2 = input.nextInt();
        System.out.print("Input third integer: ");
        number3 = input.nextInt();

        number.add(number1);
        number.add(number2);
        number.add(number3);


        Collections.sort(number);
        System.out.print("Numbers in Ascending order:" + number);

    }
    }

