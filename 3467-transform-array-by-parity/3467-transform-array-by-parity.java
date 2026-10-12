class Solution {
    public int[] transformArray(int[] nums) {
        for(int n = 0 ; n < nums.length; n++){
            if(nums[n]%2==0){
                nums[n] = 0;
            }else{
                nums[n] = 1;
            }
        }
        Arrays.sort(nums);
        return nums;
    }
}