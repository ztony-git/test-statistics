package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        double[] scores = {80.2, 33.3, 45.4, 98.7, 100.0, 66.7, 87.2, 64.4, 54.3, 13.2};

        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        double avg = sum / scores.length;

        Arrays.sort(scores);

        System.out.println("Average score: " + avg);
//        System.out.println("Sorted Array: " + Arrays.toString(scores));
        System.out.println("Highest score: " + scores[scores.length - 1]);
        System.out.println("Lowest score: " + scores[0]);
        System.out.println("Median score: " + (scores.length % 2 != 0 ? scores[scores.length / 2]
                : ((scores[scores.length / 2 - 1] + scores[scores.length / 2]) / 2)));
    }
}
