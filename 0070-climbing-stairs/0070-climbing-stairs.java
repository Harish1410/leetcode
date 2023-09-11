class Solution {
    public int climbStairs(int n) {
        int n1=0;
        int n2=1;
        int x=0;
        for(int i=0;i<n;i++){
            x=n1+n2;
            n1=n2;
            n2=x;
        }
        return x;
    }
}