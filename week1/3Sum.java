class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<len; i++){
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            int left = i+1, right = len-1;
            while(left < right){
                // while( left<right && nums[left] == nums[left+1]) left++;
                // while(left < right && nums[right] == nums[right-1]) right--;
                int sum = nums[i]+nums[left]+nums[right];
                if(sum ==0 ){
                    List<Integer> triplet = new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right]));
                    Collections.sort(triplet);
                    l.add(triplet);
                    left++;
                    right--;
                }
                else if(sum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        Set<List<Integer>> unique = new HashSet<>(l);
        l = new ArrayList<>(unique);
        return l;
    }
}