package org.rzats.algotester.regional15;

import java.util.Scanner;

/**
 * Problem statement: N workers can each process a maximum of K ballots. A worker can only
 * process ballots from adjacent boxes.
 * Given a list of bulletin counts in M ballot boxes, output the # of workers required to process them
 * (or -1 if N workers cannot process them).
 * <p>
 * Sample input:
 * 7 4 11
 * 7 4 8 5
 * <p>
 * Sample output:
 * 4
 */
public class VoteCounts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        int[] ballots = new int[m];
        for (int i = 0; i < m; i++) {
            ballots[i] = in.nextInt();
        }

        int workingEmployees = 1;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            if (sum + ballots[i] > k) {
                workingEmployees++;
                sum = ballots[i];
            } else {
                sum += ballots[i];
            }
        }

        System.out.println(workingEmployees <= n ? n - workingEmployees : -1);
        in.close();
    }
}
