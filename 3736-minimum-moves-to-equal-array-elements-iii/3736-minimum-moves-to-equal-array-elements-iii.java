class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        int n = nums.length;
        int count = 0;

        for(int i = 0; i<n; i++){
            max = Math.max(max , nums[i]);

        }
        for(int i = 0; i < n; i++){
            count = count + (max - nums[i]);
        }
        return count;
    }
}