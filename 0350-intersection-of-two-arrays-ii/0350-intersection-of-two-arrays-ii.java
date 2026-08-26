class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap <Integer,Integer> count1 = new HashMap<>();
        for(int num: nums1){
            count1.put(num , count1.getOrDefault(num , 0)+1);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(int num: nums2){
            if(count1.containsKey(num)&&count1.get(num)>0){
                result.add(num);
                count1.put(num , count1.get(num)-1);
            }
        }

        int[] ans = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            ans[i] = result.get(i);
        }
        return ans;
    }
}