package org.rzats.algotester.shef10;

import java.util.Scanner;

public class MPMoney {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextLong();
        long result = 0;
        int[] numbers = new int[]{1, 2, 5, 10, 20, 50, 100, 200, 500};
        int index = 8;
        while (n > 0) {
            if (n < numbers[index]) {
                index--;
            } else {
                n -= numbers[index];
                result++;
            }
        }
        System.out.print(result);

        in.close();
    }
}
