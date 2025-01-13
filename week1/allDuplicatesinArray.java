class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> kp = new ArrayList<>();
        int len = nums.length;
        int n[] = new int[100000];
        for(int i=0; i<len; i++){
            n[nums[i]]++;
        }
        for(int i=0; i<100000; i++){
            if(n[i] > 1)
                kp.add(i);
        }
        return kp;
    }
}