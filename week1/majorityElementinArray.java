class Solution {
    public int majorityElement(int[] nums) {
        int maj =0, count =0;
        for(int i : nums){
            if(count == 0){
                maj = i;
            }
            count+= (maj == i)? 1 : -1;
        }
        return maj;
    }
}