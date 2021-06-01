package io.vik;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution2 {
    public static void main(String[] args) {
        var arr = new int[] {1, 2, 0, 4, 0};
        var product = FindProductOfAnArray.getProduct(arr);
        var newArr = new int[arr.length];
        for (var i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArr[i] = product / arr[i];
            } else {
                newArr[i] = product;
            }

        }

        var productWithoutDivision = FindProductOfAnArray.getProductWithoutDivision(arr);

        IntStream.range(0, newArr.length).forEach(i -> System.out.println(newArr[i]));
        System.out.println(Arrays.toString(productWithoutDivision));
    }

    private static class FindProductOfAnArray {
        /*
        Method to calculate the product of each element in the array
        */
        private static int getProduct(int[] arrayOfNumbers) {
            var product = 1;
            for (int i: arrayOfNumbers) {
                if (i != 0 ) {
                    product = product * i;
                }
            }
            return product;
        }

        private static int[] getProductWithoutDivision(int[] arrayOfNumbers) {
            var arrSize = arrayOfNumbers.length;
            var newArr = new int[arrSize];
            var product = 1;
            for (var i = 0; i < arrSize; ++i ) {
                newArr[i] = product;
                if (arrayOfNumbers[i] != 0 ) {
                    product = product * arrayOfNumbers[i];
                }

            }
            var product1 = 1;
            for (var i = arrSize-1; i >= 0 ; i--) {
                newArr[i]*=product1;
                if (arrayOfNumbers[i]!=0) {
                    product1 *= arrayOfNumbers[i];
                }

            }
            return newArr;
        }

    }
}
