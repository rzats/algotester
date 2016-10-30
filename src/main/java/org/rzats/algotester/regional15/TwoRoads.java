package org.rzats.algotester.regional15;

import java.util.Scanner;

/**
 * Problem statement: Given a sequence of 2D points, return sum of distances.
 * <p>
 * Sample input:
 * 3
 * -3 2 1 5
 * 0 0 6 8
 * 4 7 6 7
 * <p>
 * Sample output:
 * 17
 */
public class TwoRoads {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int result = 0;
        for (int i = 0; i < n; i++) {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            result += Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        }

        System.out.print(result);

        in.close();
    }
}
