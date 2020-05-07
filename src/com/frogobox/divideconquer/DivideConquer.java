package com.frogobox.divideconquer;

import static com.frogobox.divideconquer.Algorithm.*;

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * divide-conquer-branch-bound
 * Copyright (C) 07/05/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.divideconquer
 */

public final class DivideConquer {

    public static void main(String[] args) {
        int[] sampleData = {4, -3, 5, -2, -1, 2, 6, -2};
        int maxSum;

        maxSum = maxSubSum1(sampleData);
        System.out.println("Max sum is " + maxSum + "; it goes from " + seqStart + " to " + seqEnd);
        maxSum = maxSubSum2(sampleData);
        System.out.println("Max sum is " + maxSum + "; it goes from " + seqStart + " to " + seqEnd);
        maxSum = maxSubSum3(sampleData);
        System.out.println("Max sum is " + maxSum + "; it goes from " + seqStart + " to " + seqEnd);
        maxSum = maxSubSum4(sampleData);
        System.out.println("Max sum is " + maxSum);

        // Get some timing info
        for (int n = 10; n <= 1000000; n *= 10) {
            for (int alg = 4; alg >= 1; alg--) {
                if (alg == 1 && n > 50000)
                    continue;
                getTimingInfo(n, alg);
            }
        }

    }
}