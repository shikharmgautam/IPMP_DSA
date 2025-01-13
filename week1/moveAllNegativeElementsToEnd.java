

// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        // Your code goes here
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        int len = arr.length;
        for(int i =0; i<len; i++){
            if(arr[i] < 0){
                neg.add(arr[i]);
            }
        }
        for(int i =0; i<len; i++){
            if(arr[i] >= 0){
                pos.add(arr[i]);
            }
        }
        for(int i=0; i<len;i++){
            if ( i < pos.size()){
                arr[i]= pos.get(i);
            }
            else{
                arr[i] = neg.get(i-pos.size());
            }
        }
    }
}