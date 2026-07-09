class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int rep = 0;
        int mis = 0;
        int[] ans = new int[2];
        
        for(int i = 0; i<n; i++){
            int val = Math.abs(nums[i]);
            int pos = val - 1;
                if(nums[pos] > 0){
                    nums[pos] = - nums[pos];
                }
                else{
                    rep = val;
                }
        }
        for(int i  = 0; i<n; i++){
            if(nums[i] > 0){
               mis = i + 1;
               
                 
            }
        }
        return new int[]{rep , mis};    }
}