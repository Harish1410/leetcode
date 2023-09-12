class Solution {
    public boolean isMonotonic(int[] nums) {
        int len=nums.length-1;
        int count=0;
        if(nums[0]<nums[len]){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                count++;
            }
            else
                count--;
        }
        }
        else{
            for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                count++;
            }
            else
                count--;
        }
        }
        if(count!=len){
            return false;
        }
        return true;
    }
}