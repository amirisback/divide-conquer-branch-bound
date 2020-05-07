package com.frogobox.divideconquer;

import static com.frogobox.divideconquer.Algorithm.*;

public final class DivideConquer {

    public static void main(String[] args) {
        int a[] = {4, -3, 5, -2, -1, 2, 6, -2};
        int maxSum;

        maxSum = maxSubSum1(a);
        System.out.println("Max sum is " + maxSum + "; it goes"
                + " from " + seqStart + " to " + seqEnd);
        maxSum = maxSubSum2(a);
        System.out.println("Max sum is " + maxSum + "; it goes"
                + " from " + seqStart + " to " + seqEnd);
        maxSum = maxSubSum3(a);
        System.out.println("Max sum is " + maxSum + "; it goes"
                + " from " + seqStart + " to " + seqEnd);
        maxSum = maxSubSum4(a);
        System.out.println("Max sum is " + maxSum);

        // Get some timing info
        for (int n = 10; n <= 1000000; n *= 10)
            for (int alg = 4; alg >= 1; alg--) {
                if (alg == 1 && n > 50000)
                    continue;
                getTimingInfo(n, alg);
            }
    }
}