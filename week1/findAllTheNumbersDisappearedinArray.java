class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        int l[] =  new int[len];
        for(int i=0; i<len; i++){
            l[nums[i]-1] = 1;
        }
        List<Integer> dis = new ArrayList<>();
        for(int i=0; i<len; i++){
            if(l[i] == 0){
                dis.add(i+1);
            }
        }
        return dis;
    }
}