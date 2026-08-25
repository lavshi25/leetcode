class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet <Integer> idk = new HashSet<>();

        for(int num : nums){
            idk.add(num);
        }

        int i = 1;
        int no = k*i;

        
            while(idk.contains(no)){
                i++;
                no = k * i;
            }
            
        

        return no; 
        
    }
}