class Solution {
    public boolean isPowerOfFour(int n) {
        int val=n;
        if(val==1){
            return true;
        }
        if(val<=0){
            return false;
        }
        if (n % 4 == 0) {
            return isPowerOfFour(n / 4);
        }
        return false;
    }
}