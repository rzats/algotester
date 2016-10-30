package org.rzats.algotester.regional15;

import java.util.Scanner;

/**
 * Problem statements: Return the min. amount of endings from P required to construct R.
 * (Solution isn't optimal/accepted. TODO: rework)
 * <p>
 * Sample input:
 * glorytoukraine
 * ukraineaineaine
 * <p>
 * Sample output:
 * 3
 */
public class ShoutSuffixes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String p = in.nextLine();
        String r = in.nextLine();

        int minEndings = 1;
        int rStart = 0;
        int rEnd = r.length() - 1;
        while (rStart < rEnd) {
            if (p.endsWith(r.substring(rStart, rEnd))) {
                minEndings++;
                rStart = rEnd + 1;
                rEnd = r.length() - 1;
            } else {
                rEnd--;
            }
        }
        System.out.println(minEndings);

        in.close();
    }
}
