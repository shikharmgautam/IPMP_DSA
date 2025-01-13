

class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int k=0;
        for(int z=0;z<=arr.length-1;z++){
            if(arr[z] == target){
                k++;
            }
            else continue;
        }
        return k;
    }
}