class Solution {
    public String reverseWords(String s) {
        String[] d=s.trim().split("\\s+");

        String rev="";
            for(int i=d.length-1;i>0;i--){
                rev+=d[i]+" ";   
            }
        return rev+d[0];
    }
}