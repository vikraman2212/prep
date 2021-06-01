package io.vik;

import java.util.stream.IntStream;

public class Solution2 {
    public static void main(String[] args) {
        var arr = new int[] {1, 0, 3, 4, 0};
        var product = FindProductOfAnArray.getProduct(arr);
        var newArr = new int[arr.length];
        for (var i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newArr[i] = product / arr[i];
            } else {
                newArr[i] = 0;
            }

        }

        IntStream.range(0, newArr.length).forEach(i -> System.out.println(newArr[i]));
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

    }
}
