package leetcode;

import java.util.Arrays;

public class TwoSums {

    public static int[] twoSum(int[] nums, int target) {
        int[] indexOfSummedNumbers = new int[3];
        for (int i = 0; i < nums.length; i++) {
            if ((nums[0] + nums[1]) == target) {
                indexOfSummedNumbers[i] = i;
                indexOfSummedNumbers[i + 1] = i + 1;
            }
        }
        System.out.println(nums.length);

        return indexOfSummedNumbers;
    }

    public static void main(String[] args) {

        int[] numbers = new int[2];
        numbers[0] = 1;
        numbers[1] = 2;
        int[] expectedSum = twoSum(numbers, 3);
        System.out.println(Arrays.toString(expectedSum));
    }
}