class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e  = n-1;
        int pivot = 0;

        while(s<=e){
            int mid = (s+e)/2;

            if(nums[mid] <= nums[n-1]){
                e = mid - 1;
            }
            else{
                pivot = mid + 1;
                s = mid + 1;
            }
        }
        int ans = nums[pivot];
        return ans;
        
    }
}