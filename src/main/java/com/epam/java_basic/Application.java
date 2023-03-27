package com.epam.java_basic;

import com.epam.java_basic.array_processor.ArrayProcessor;

/**
 * Application's entry point, use it to demonstrate your code execution
 */
public class Application {

    public static void main(String[] args) {
        ArrayProcessor mass = new ArrayProcessor();
        int[] arr = {-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2};

        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();



        System.out.println("1) Exchange max negative and min positive elements: ");
        System.out.println(mass.swapMaxNegativeAndMinPositiveElements(arr));

        System.out.println("2) Sum of elements on even positions: ");
        System.out.println(mass.countSumOfElementsOnEvenPositions(arr));


        System.out.println("3) Replace negative values with 0 ");
        System.out.println(mass.replaceEachNegativeElementsWithZero(arr));


        System.out.println("4) Multiply by 3 each positive element standing before negative one");
        System.out.println(mass.multiplyByThreeEachPositiveElementStandingBeforeNegative(arr));



        System.out.println("5) Difference between average and min element in array: ");
        System.out.println(mass.calculateDifferenceBetweenAverageAndMinElement(arr));

        System.out.println("6) Elements which present more than one time and stay on odd index ");
//        System.out.println(mass.findSameElementsStandingOnOddPositions(arr));
        mass.findSameElementsStandingOnOddPositions(arr);


    }

}
