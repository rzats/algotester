package org.rzats.algotester.regional15;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Problem statement: Given a list of time intervals between 8AM and 8PM, return the amount of time
 * (in seconds) not covered by any interval.
 * <p>
 * Sample input:
 * 4
 * 08 30 00 09 00 00
 * 10 00 00 18 00 00
 * 08 00 00 08 10 00
 * 08 05 00 08 20 00
 * <p>
 * Sample output:
 * 11400
 */
public class ElectionObservers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[][] intervals = new int[n][];
        for (int i = 0; i < n; i++) {
            int h1 = in.nextInt();
            int m1 = in.nextInt();
            int s1 = in.nextInt();
            int h2 = in.nextInt();
            int m2 = in.nextInt();
            int s2 = in.nextInt();
            intervals[i] = new int[]{toSeconds(h1, m1, s1), toSeconds(h2, m2, s2)};
        }

        Arrays.sort(intervals, (o1, o2) -> Integer.compare(o1[0], o2[0]));

        int result = toSeconds(20, 0, 0) - toSeconds(8, 0, 0);
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int[] interval : intervals) {
            if (interval[0] <= end) {
                end = Math.max(end, interval[1]);
            } else {
                result -= end - start;
                start = interval[0];
                end = interval[1];
            }
        }

        result -= end - start;

        System.out.print(result);

        in.close();
    }

    private static int toSeconds(int h, int m, int s) {
        return h * 60 * 60 + m * 60 + s;
    }
}
