class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap <Integer , Integer> idk = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int num : nums){
            idk.put(num , idk.getOrDefault(num , 0)+1);
        }

        for(Map.Entry<Integer , Integer> entry : idk.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if(value > (nums.length)/3){
                list.add(key);

            }
        }
            return list;
        
    }
}