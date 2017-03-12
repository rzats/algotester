package org.rzats.algotester.shef10;

import java.util.Scanner;

public class Parliament {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        long parties[] = new long[n];
        for (int i = 0; i < n; i++) {
            parties[i] = in.nextLong();
        }
        long gcd = gcd(parties, 0, n - 1);
        long result = 0;
        for (int i = 0; i < n; i++) {
            result += parties[i] / gcd;
        }
        System.out.print(result);

        in.close();
    }

    private static long gcd(long a, long b) {
        long t;
        if (a < b) {
            t = a;
            a = b;
            b = t;
        }

        return (b == 0) ? a : gcd(b, a % b);
    }

    private static long gcd(long numbers[], int p, int q) {
        long x;
        int r = (q + p) / 2;
        if (p == q) {
            return numbers[p];
        } else {
            long left = gcd(numbers, p, r);
            long right = gcd(numbers, r + 1, q);
            x = gcd(left, right);
            return x;
        }
    }
}