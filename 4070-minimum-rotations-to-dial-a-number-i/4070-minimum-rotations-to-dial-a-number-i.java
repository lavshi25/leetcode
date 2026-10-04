class Solution {
    public int minRotations(String s) {
        int cur = 0;
        int ans = 0;
        for(char ch: s.toCharArray()){
            int target = ch - '0';
            int diff = Math.abs(cur - target);
            int rot = Math.min(diff, 10-diff);

            ans = ans + rot;
            cur = target;
        }
        return ans;
    }
}