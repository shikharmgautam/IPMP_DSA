class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len;j++){
                if((nums[i] + nums[j] )== target){
                    int a[] = new int[2];
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }
        int a[] = {0,0};
        return (a);
    }
}