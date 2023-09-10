class Solution {
    public int lengthOfLastWord(String s) {
     String[] s1=s.split(" ");
        int len=s1.length;
        String a=s1[len-1];
        return a.length();
        
    }
}