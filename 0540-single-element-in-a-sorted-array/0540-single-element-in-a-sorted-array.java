class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n-1;

        while(s<=e){
            int mid = (s+e)/2;
            if(s==e){
                return nums[s];
            }
            int cval = nums[mid];
            int prevval = -1;
            if(mid - 1 >= 0){
                prevval = nums[mid-1];
            } 
            int nextval = -1;
            if(mid+1 < n){
                nextval = nums[mid+1];
            }
            if(cval != prevval && cval != nextval){
                return cval;
            }
            if(cval!=prevval && cval == nextval){
                int startingindex = mid;

                if(startingindex%2 != 0){
                    e = mid - 1;
                }
                else{
                    s = mid + 1;
                }
            }
            else if(cval == prevval && cval != nextval){
                int endingindex = mid;

                 if(endingindex%2 != 0){
                    s = mid + 1;
                }
                else{
                    e = mid - 1;
                }

            }
        }
        return -1;
    }
}