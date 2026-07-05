class Solution {
    public boolean isPowerOfThree(int num) {
        if(num<=0){
            return false;
        }
        while(num % 3 == 0){
            num = num / 3;
        }
        if(num == 1){
            return true;
        }
        else{
            return false;
        }
    }
}