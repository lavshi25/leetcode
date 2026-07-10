class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i =0; i<n; i++){
            int val = Math.abs(nums[i]);
            int pos = val - 1;
            if(nums[pos] > 0){
                nums[pos] = - nums[pos];

            }
            else{
                ans = val;
            }
           
        }
        
        return ans;
    }
}