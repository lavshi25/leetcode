class Solution {
    public boolean checkDivisibility(int n) {
        int original = n;
        int sum = 0;
        int prod = 1;

        while(n!=0){
            int m = n % 10;
            sum = sum + m;
            prod = prod * m;

            n = n / 10;
        }

        if(original% (sum+prod)==0){
            return true;
        }
        return false;
    }
}