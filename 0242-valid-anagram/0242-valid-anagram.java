class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()<t.length())
            return false;
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean status=true;
        if(Arrays.equals(a,b))
            return true;
        else
            return false;
        
    }
}