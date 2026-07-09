class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int val = Math.abs(nums[i]);
            int pos = val - 1;
            if(nums[pos] > 0){
                nums[pos] = - nums[pos];
            }
            
        }
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                ans.add(i+1);
            }
        }
        
        return ans;
    }
}