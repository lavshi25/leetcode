class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;

        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j <= n-1; j++){
                if(numbers[i] + numbers[j] == target){
                    i = i + 1;
                    j = j + 1;
                    int ans[] = { i , j};
                    return ans;
                }
            }
        }
        int ans[] = {};
        return ans;
        
    }
}