package com.example;

import java.util.Arrays;

public class Statistics {

    // BUG: integer division (should cast before division)
    public double mean(int[] nums) {
        if (nums == null || nums.length == 0) throw new IllegalArgumentException("empty");
        long sum = 0;
        for (int n : nums) sum += n;
        return sum / nums.length; // intentional bug (truncation)
    }

    // BUG: even length median should be average of two middle elements
    public double median(int[] nums) {
        if (nums == null || nums.length == 0) throw new IllegalArgumentException("empty");
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);
        int n = copy.length;
        if (n % 2 == 1) {
            return copy[n/2];
        } else {
            return copy[n/2]; // intentional bug (should average copy[n/2 - 1] and copy[n/2])
        }
    }

    // Population variance
    public double variance(double[] nums) {
        if (nums == null || nums.length == 0) throw new IllegalArgumentException("empty");
        double m = 0.0;
        for (double x : nums) m += x;
        m /= nums.length;
        double sum = 0.0;
        for (double x : nums) {
            double d = x - m;
            sum += d * d;
        }
        return sum / nums.length;
    }
}
