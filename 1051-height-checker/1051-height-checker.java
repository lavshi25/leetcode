class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] expected = new int[n];
       
        for(int i = 0; i < n; i++){
            expected[i] = heights[i];
        }
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j<= n-1; j++){
               
                    if(expected[i] > expected[j]){
                        int temp = expected[i];
                        expected[i] = expected[j];
                        expected[j] = temp;
                    }
                
            }
        }
        int count = 0;
        for(int i =0; i<n; i++){
            if(heights[i] != expected[i]){
                count++;
            }
        }
        return count;
    }
}