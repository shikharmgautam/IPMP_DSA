
  
 
//User function Template for Java

class Solution
{
    
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        int flip =n;
        int[] freq = new int[2*n+1];
        freq[n]=1;
        for(int val : arr){
            if(val == 0)
                flip--;
            if(val ==1){
                flip++;
            }
            freq[flip]++;
        }
        int res=0;
        for(int val : freq){
            res += val*(val-1)/2;
        }
        return res;
    }
}
