package com.epam.java_basic.array_processor;

import java.util.Arrays;

/**
 * Useful methods for array processing
 */
public class ArrayProcessor {

    public int[] swapMaxNegativeAndMinPositiveElements(int[] input) {
        int[] result = Arrays.copyOf(input, input.length);

        int max_negative = Integer.MIN_VALUE;
        int min_positive = Integer.MAX_VALUE;
        int positive = 0;
        int negative = 0;
        int temp;
        for (int i = 0; i < result.length; i++) {
            if ((result[i] < 0) && (max_negative < result[i])) {
                max_negative = result[i];
                negative = i;
            }
            if ((result[i] > 0) && (min_positive > result[i])) {
                min_positive = result[i];
                positive = i;
            }
        }
        temp = result[negative];
        result[negative] = result[positive];
        result[positive] = temp;

        return result;
    }

    public int countSumOfElementsOnEvenPositions(int[] input) {
        int som = 0;
        for (int i = 0; i < input.length; i++) {
            if (i % 2 == 0) {
                som += input[i];
            }
        }
        return som;
    }

    public int[] replaceEachNegativeElementsWithZero(int[] input) {
        int[] result = Arrays.copyOf(input, input.length);
        for (int i = 0; i < result.length; i++) {
            if (result[i] < 0) {
                result[i] = 0;
            }
        }
        return result;
    }

    public int[] multiplyByThreeEachPositiveElementStandingBeforeNegative(int[] input) {
        int[] result = Arrays.copyOf(input, input.length);
        for (int i = 1; i < result.length; i++) {
            if (result[i] < 0 && result[i - 1] > 0) {
                result[i - 1] = result[i - 1] * 3;
            }
        }
        return result;
    }

    public float calculateDifferenceBetweenAverageAndMinElement(int[] input) {
        float sum = 0;
        float min = input[0];
        for (int i = 0; i < input.length; i++) {
            sum += input[i];

            if (input[i] < min) {
                min = input[i];
            }
        }
        sum /= input.length;
        sum -= min;
        return sum;
    }

    public void findSameElementsStandingOnOddPositions(int[] input) {
        int[] result = Arrays.copyOf(input, input.length);
        boolean isRepeated = false;
        int count = 0;


        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] == result[j] && (i % 2 == 1 || j % 2 == 1)) {
                    isRepeated = true;
                    System.out.print(result[i] + " ");
                    count++;
                    if (count >= 1) {
                        break;
                    }
                }
            }
        }
    }

}
