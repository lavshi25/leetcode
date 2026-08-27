class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> count = new HashMap<>();

        for(int num : arr){
            count.put(num , count.getOrDefault(num , 0)+1);
        }

        HashSet<Integer> set = new HashSet<>();

        for(int frequency : count.values()){
            if(set.contains(frequency)){
                return false;
            }
            set.add(frequency);
        }
        return true;
    }
}