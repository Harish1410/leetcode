class Solution {
    public boolean isPowerOfThree(int n) {
        int val=n;
        if(val==1)
            return true;
        if(val<=0)
            return false;
        if(val%3==0){
            return isPowerOfThree(val/3);
        }
        return false;
    }
}