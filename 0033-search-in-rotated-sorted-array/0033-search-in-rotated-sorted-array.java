class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int s = 0;
        int e = n-1;
        int pivot = 0;
        
        while(s <= e){
            int mid = (e+s)/2;

            if(nums[mid] <= nums[n-1]){
                e = mid - 1;
            }
            else{
                pivot = mid;
                s = mid + 1;
            }
        }

        if(target >= nums[0] && target <= nums[pivot] ){
            s = 0;
            e = pivot;
        }
       else{
        s = pivot + 1;
        e = n - 1;
       }
    while(s<=e){
        int mid = (s+e)/2;

        if(nums[mid] == target){
            return  mid;
        }
        else if(nums[mid] < target){
            s = mid + 1;
        }
        else{
            e = mid - 1;
        }
            
    
    }
    return -1;   
        
    }
}