

class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        Set<Integer> s = new HashSet<>();
        int res =0, count =0;int curr;
        for(int val : arr){
            s.add(val);
        }
        for(int val : arr){
            if(s.contains(val) && !s.contains(val-1)){
                curr =val; count =0;
                while(s.contains(curr)){
                    s.remove(curr);
                    curr++;
                    count++;
                }
                res = Math.max(res, count);
            }
        }
        return res;
    }
}