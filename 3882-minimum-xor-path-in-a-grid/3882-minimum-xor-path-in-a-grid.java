class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][][] dp = new boolean[m][n][1024];

        dp[0][0][grid[0][0]] = true;

        for(int r = 0; r < m; r++){
            for(int c = 0; c < n; c++){
                if(r==0 && c==0){
                    continue;
                }
                int value = grid[r][c];
            
        

                for(int xor = 0; xor < 1024; xor++){
                    if(r>0 && dp[r-1][c][xor]){
                        dp[r][c][xor^value] = true;
                    }
                    if( c>0 && dp[r][c-1][xor]){
                        dp[r][c][xor^value] = true;
                    }
                }
            }
        }

        for(int xor = 0 ; xor<1024; xor++){
            if(dp[m-1][n-1][xor]){
                return xor;
            }
        }

        return -1;
    }
}