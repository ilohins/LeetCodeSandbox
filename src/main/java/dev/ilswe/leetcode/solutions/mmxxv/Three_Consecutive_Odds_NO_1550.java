package dev.ilswe.leetcode.solutions.mmxxv;

import java.util.stream.StreamSupport;

public class Three_Consecutive_Odds_NO_1550 {


    public boolean threeConsecutiveOdds(int[] arr) {

        int consOdds = 0;
        for(int i : arr) {
            /**
             * 0 & 0 = 0
             * 0 & 1 = 1
             * 1 & 0 = 0
             * 1 & 1 = 2
             * 2 & 1 = 3
             * 2 & 0 = 0
             */
            consOdds = (consOdds << 1 | 1) * ((i & 1));

            if ((consOdds == 7)) {
                return true;
            }
        }

        return false;
    }

    public boolean threeConsecutiveOdds2(int[] arr) {

        int consOdds =0;
        for(int i : arr) {
            if (i % 2 == 1) {
                consOdds++;
            } else {
                consOdds = 0;
            }

            if (consOdds >= 3) {
                return true;
            }
        }

        return false;
    }
}
