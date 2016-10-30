package org.rzats.algotester.misc;

import java.util.Scanner;

/**
 * Problem statement: Sample OJ problem, add two numbers.
 * <p>
 * NB: use this template for all other solutions!
 * (void main actually matters, and the package name should be removed)
 */
public class APlusB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int result = a + b;
        System.out.print(result);

        in.close();
    }
}
