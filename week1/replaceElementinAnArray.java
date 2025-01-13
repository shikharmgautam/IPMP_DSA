class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        Map<Integer, Integer> m = new HashMap<>();
        int len = nums.length;
        for(int i=0; i<len; i++){
            m.put(nums[i], i);
        }
        len = operations.length;
        int index;
        for(int[] val : operations){
            index = m.get(val[0]);
            m.remove(val[0]);
            m.put(val[1], index);
        }
        for( int key : m.keySet() ){
            nums[m.get(key)] = key;
        }
        return nums;
    }
}