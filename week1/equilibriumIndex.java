

class Solution {
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(int arr[]) {
        // code here
        int suml =0, sumr = 0;
        int len = arr.length;
        for(int i=1; i<len; i++){
            sumr += arr[i];
        }
        for(int i=0; i<len-1; i++){
            if(suml == sumr)
                return (i+1);
            suml+=arr[i];
            sumr-=arr[i+1];
        }
        return -1;
    }
}