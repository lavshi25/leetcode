class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> happy = new HashSet<>();
       while(n!=1 && !happy.contains(n)){
            happy.add(n);
            int sum = 0;

            while(n!=0){
                int digit = n % 10;
                
                sum = sum + (digit*digit);

                n = n / 10;
            }
            n= sum;
       }

       if( n == 1){
        return true;
       }
       return false;
        
    }
}