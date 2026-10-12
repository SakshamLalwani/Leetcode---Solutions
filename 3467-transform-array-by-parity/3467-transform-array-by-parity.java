class Solution {
    public int[] transformArray(int[] nums) {
        int even = 0, odd = 0;
        for(int n = 0 ; n < nums.length; n++){
            if(nums[n]%2==0){
                nums[n] = 0;
                even++;
            }else{
                nums[n] = 1;
                odd++;
            }
        }
        for(int i = 0; i< even; i++){
            nums[i]=0;
        }for(int i = even; i< even + odd;i++){
            nums[i]=1;
        }
        return nums;
    }
}