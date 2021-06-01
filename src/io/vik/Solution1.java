package io.vik;
import java.util.HashMap;
import java.util.List;

public class Solution1 {

    public static void main(String[] args) {
        System.out.println(findMatchInList(List.of(1, 2, 6, 9, 19), 23));
        System.out.println(findMatchInListUsingMap(List.of(1, 2, 6, 9, 19), 23));
    }

    public static final boolean findMatchInList(List<Integer> integerList, int k) {

        for (int num: integerList) {
            if (hasInt(integerList, Math.abs(num - k))) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasInt(List<Integer> integerList, int difference) {
        return integerList.contains(difference);
    }

    public static final boolean findMatchInListUsingMap(List<Integer> integerList, int k) {
        var mapWithDifferences = new HashMap<>();
        for (var i: integerList) {
            var difference = Math.abs(i - k);

            if (difference == 0 || mapWithDifferences.containsKey(i)) {
                return true;
            } else {
                mapWithDifferences.put(difference, 0);
            }
        }
        return false;
    }

}
