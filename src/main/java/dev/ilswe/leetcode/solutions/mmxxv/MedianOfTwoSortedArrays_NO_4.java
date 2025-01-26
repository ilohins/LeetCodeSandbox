package dev.ilswe.leetcode.solutions.mmxxv;

import java.util.Iterator;

/*
 * LC Results: 59% runtime, 43% memory
 */
public class MedianOfTwoSortedArrays_NO_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        TwoSortedArraysIterator iterator = new TwoSortedArraysIterator(nums1, nums2);

        boolean isSizeEven = (((nums1.length + nums2.length) % 2) == 0);
        int medianPosition = (int) ((nums1.length + nums2.length) / 2) + (isSizeEven ? -1 : 0);

        int gen = 0;
        while (iterator.hasNext()) {
            if(medianPosition == gen) {
                int result = iterator.next();

                if (isSizeEven) {
                     return ((double)(result + iterator.next())) / 2;
                } else {
                    return result;
                }
            } else {
                iterator.next();
            }

            gen += 1;
        }

        return 0.0;
    }
}

class TwoSortedArraysIterator implements Iterator<Integer> {

    private final int[] arrayA;
    private final int[] arrayB;

    private int itA, itB = 0;

    public TwoSortedArraysIterator(int[] arrayA, int[] arrayB) {
        this.arrayA = arrayA;
        this.arrayB = arrayB;
    }

    @Override
    public boolean hasNext() {
        return (arrayA.length > itA) || (arrayB.length > itB);
    }

    @Override
    public Integer next() {
        if ((arrayA.length > itA) && (arrayB.length > itB)) {
            if ( arrayA[itA] < arrayB[itB]) {
                itA += 1;
                return arrayA[itA-1];
            } else {
                itB+=1;
                return arrayB[itB-1];
            }
        } else if ((arrayA.length > itA)){
            itA += 1;
            return arrayA[itA-1];
        } else {
            itB += 1;
            return arrayB[itB - 1];
        }
    }
}