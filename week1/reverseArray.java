

class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int len = arr.length;
        int res[] =  new int[len];
        for (int i=len-1; i>=0; i--){
            res[len-i-1]= arr[i];
        }
        for(int i=0; i<len;i++ ){
            arr[i] = res[i];
        }
    }
}