class Solution {
    public int singleNumber(int[] nums) {
        int xorsum = 0;
        for(int n: nums){
            xorsum = xorsum ^ n;
        }
        return xorsum;
    }
}