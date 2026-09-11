class Solution {
    public int totalNumbers(int[] digits) {
       
            int count = 0;
            int[] freq = new int[10];

            for(int digit:digits){
                freq[digit]++;
            }

          
       
            for(int i = 0; i <=9; i++){
            

                for(int j = 0; j <=9; j++){
                    for(int k = 0; k <=9; k++){
                        
                        
                            int num = i * 100 + j* 10 + k;
                            freq[i]--;
                            freq[j]--;
                            freq[k]--;
                            if(i!=0 && freq[i]>=0 && freq[j]>=0 && freq[k]>=0){
                                if(num%2 == 0){
                                    count++;
                                }
                            }
                             freq[i]++;
                            freq[j]++;
                             freq[k]++;
                            
                        
                    }
                }
            }
           
        
            
        
        return count;
        
    }
}