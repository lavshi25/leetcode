class Solution {
    public int strStr(String haystack, String needle) {

        while(haystack.contains(needle)){
            int index = haystack.indexOf(needle);
            return index;
        }
        return -1;
    }
}