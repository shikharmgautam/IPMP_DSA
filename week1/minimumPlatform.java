

// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int max =0,c=0;
        int n = arr.length;
        for (int i=0, j=0; i<n && j<n; ){
            if(arr[i]<=dep[j]){
                c++;
                i++;
            }
            else{
                max = Math.max(c, max);
                c--;
                j++;
            }
        }
        max = Math.max(c, max);
        return max;
    }
}