package dev.ilswe.leetcode.solutions.mmxxv;

public class LengthofLongestFibonacciSubsequence_NO_873 {
    public int lenLongestFibSubseq(int[] arr) {

        int startIdx = 0, maxResult = 0;
        while(startIdx < arr.length -2) {
            //System.out.println("1st level: index 1:" + startIdx);
            maxResult = Math.max(checkFibonacciSequence2ndIdx(arr, startIdx, 0), maxResult);

            startIdx++;
        }
        return maxResult;
    }

    private int checkFibonacciSequence2ndIdx(int[] arr, int startIdx, int fibCount) {

        int fibCountMax = 0;
        int secondIdx = startIdx + 1;
        while (secondIdx < arr.length -1) {
            //System.out.println("2st level: index 1:" + startIdx + " index 2: " + secondIdx);
            fibCountMax = Math.max(checkFibonacciSequence3rdIdx(arr, startIdx, secondIdx, fibCount), fibCountMax);

            secondIdx++;
        }

        return fibCountMax;
    }

    private int checkFibonacciSequence3rdIdx(int[] arr, int startIdx, int secondIdx, int step) {

        int thirdIdx = secondIdx + 1;

        while (startIdx < arr.length -2 && secondIdx < arr.length -1 && thirdIdx < arr.length) {
            //System.out.println("3rd level: index 1:" + startIdx + " index 2: " + secondIdx + " index 3: " + thirdIdx);

            int fiboIndicator = isFibonacciSequence(arr[startIdx], arr[secondIdx], arr[thirdIdx]);
            if (fiboIndicator == 0) {
                step += step == 0 ? 3 : 1;

                //System.out.println("Fibonacci found, shifting to the next value: new 1st:" + secondIdx + " new second: "
                //        + thirdIdx + " current longest sequence: " + step);

                return checkFibonacciSequence3rdIdx(arr, secondIdx, thirdIdx, step);
            } else if (fiboIndicator < 0) {
                //check value exceeds first and seconds, Fibonacci sequence interrupted, skip further elements
                return step;
            }

            thirdIdx++;
        }

        return step;
    }

    /**
     * Less than 0 means a + b is less than C
     * 0 means a + b == c (fibonacci sequence)
     * More than 0 means a + b is greater than C
     *
     * This function is used to skip rest of the elements in the array if result is less than 0
     */
    private int isFibonacciSequence(int a, int b, int c) {
        return a + b - c;
    }
}
