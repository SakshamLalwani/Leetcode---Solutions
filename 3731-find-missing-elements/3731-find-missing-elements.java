class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int j = 0;
        for(int i = nums[j]; i < nums[nums.length - 1]; i++){
            if(i == nums[j] ){
                j++;
            }else{
                list.add(i);
            }
        }
        return list;
    }
}