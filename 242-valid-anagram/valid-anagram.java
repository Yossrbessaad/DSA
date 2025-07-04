class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false ;
        }
        char [] sSort = s.toCharArray();
        char [] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        return Arrays.equals(sSort, tSort);
        /*
        2nd solution using HashMap
        HashMap<String,Integer> sCount = new HashMap<>();
        HashpMap<String,Integer> tCount = new HashMap<>();
        for(int i=0; i<s.length();i++=){
            sCount.put(s.charAt(i), sCount.getOrDefault(s.charAt(i),0)+1);
            tCount.put(s.chatAt(i), tCount.getOrDefault(t.charAt(i),0)+1);
        }
        return sCount.equals(tCount);
        */

    }
}