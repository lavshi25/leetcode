class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> count1 = new HashMap<>();
        for(char c: s.toCharArray()){
            count1.put(c , count1.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> count2 = new HashMap<>();
        for(char c: t.toCharArray()){
            if(count1.containsKey(c) && count1.get(c)>0){
                count1.put(c, count1.get(c)-1);
            }
            else{
                return c;
            }
        }

            return ' ';        




        
    }
}