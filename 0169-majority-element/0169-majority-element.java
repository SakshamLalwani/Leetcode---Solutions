class Solution {
    public int majorityElement(int[] nums) {
        boolean[] b = new boolean[nums.length];
        int rank=0;
        for(int i = 0;i<nums.length-1;i++){
            if(b[i]) continue;
            int cnt = 1;
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    b[j] = true;
                    cnt++;
                }
            }
            if(cnt>nums.length/2){
                rank=i;
                return nums[i];
            }
        }
        return nums[rank];
    }
}