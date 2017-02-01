package pl.gawly;

import java.util.Arrays;

public class Solution {

    public int solution(int[] A) {
        int result = 1;

        Arrays.sort(A);
        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i-1]) {
                result++;
            }

        }

        return result;
    }
}
