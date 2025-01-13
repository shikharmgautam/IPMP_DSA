

// User function Template for Java
class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        int len = arr.length;
        int max = arr[0];
        int res =arr[0];
        for(int i=1; i<len; i++){
            max = Math.max(arr[i], max+arr[i]);
            res = Math.max(res, max);
        }
        return res;
    }
}