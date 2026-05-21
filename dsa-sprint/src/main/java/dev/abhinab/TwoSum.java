package dev.abhinab.dsa_sprint;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
       int[] arr = new int[] {2,7,11,15};
       int target = 9;
       System.out.println("optimised two sum: " + Arrays.toString(twoSumOptimised(arr, target)));
       System.out.println("brute force two sum: " + Arrays.toString(twoSumBrute(arr, target)));
       arr = new int[] {3, 2, 4};
       target = 6;
       System.out.println("brute force two sum: " + Arrays.toString(twoSumBrute(arr, target)));
       System.out.println("optimised two sum: " + Arrays.toString(twoSumOptimised(arr, target)));
       arr = new int[] {3, 3};
       System.out.println("brute force two sum: " + Arrays.toString(twoSumBrute(arr, target)));
       System.out.println("optimised two sum: " + Arrays.toString(twoSumOptimised(arr, target)));
    }
    
    /**
     * brute-force approach with O(N^2) time complexity
     * @param arr array
     * @param target sum
     * @return indices of the elements which on adding gives the target sum
     */
    private static int[] twoSumBrute(int[] arr, int target) {
        int[] result = new int[] {-1, -1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) { // because of 2 nested loops the time complexity is O(N^2)
                if (i != j) {
                    if (arr[i] + arr[j] == target) {
                        result = new int[] {i, j};
                        break;
                    }
                }
            }
        }
        return result;
        // since we are storing the value in an array, then the space complexity becomes O(1) 
    }

    /**
     * @param arr array of integers
     * @param target the target sum of two elements
     * @return array of indices of 2 numbers whose sum equals target sum
     */
    private static int[] twoSumOptimised(int[] arr, int target) {
        // this variable will influence the memory footprint of our of out code
        // this variable directly depends on the size of the array
        Map<Integer, Integer> map = new HashMap<>();
        // memory footprint doesn't increase with the increase in size of the array
        // this array has a constant size of 2 which doesn't depend on the size of the array
        int[] result = new int[] {-1, -1};

        // since with 1 iteration we are able to find both the target numbers,
        // hence the time complexity becomes O(N)
        for (int i = 0; i < arr.length; i++) {
            int difference = target - arr[i];
            // containsKey will take O(1) time complexity, as HashMap will use a mathematical Hash function to check
            if (map.containsKey(difference)) {
                result[0] = map.get(difference);
                result[1] = i;
                break;
            } else {
                // this operation will also give us O(1) time complexity as the same hash will be utilised to find the
                // spot to put the element
                map.put(arr[i], i);
            }
        }
        return result;
        // since we did not utilise any extra variable to save or store something,
        // out memory will only depend on the map variable which directly depends on the number of 
        // elements of the array so the space complexity becomes O(N)
        
        /*
         * total time complexity: O(N) X (O(1) + O(1))
         *                      = O(N) X O(2)
         *                      = O(2N)
         *                      = O(N)
         * total space complexity: O(N)
         */
    }
}

