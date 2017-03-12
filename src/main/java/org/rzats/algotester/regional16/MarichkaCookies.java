package org.rzats.algotester.regional16;

import java.util.Scanner;

public class MarichkaCookies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextLong();

        long result = 0;
        for (long i = 0; i < n; i++) {
            result += Math.max(in.nextLong() - 1, 0);
        }
        System.out.print(result);

        in.close();
    }
}
