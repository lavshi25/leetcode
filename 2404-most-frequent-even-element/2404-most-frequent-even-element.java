class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer , Integer> idk = new HashMap<>();
        int maxfreq = 0;
        int ans = -1;

        for(int num: nums){
            idk.put(num , idk.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer,Integer>entry : idk.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if(key%2 == 0){
                

                if(value>maxfreq){
                    maxfreq = value;
                    ans = key;
                }
                else if(value == maxfreq && key<ans){
                    ans = key;
                }

            }
        }
        return ans;
    }
}