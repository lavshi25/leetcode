class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        int ans = 0;
        for(int i =0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
                ans = i;
                
            }
        }
        return ans;
    }
}