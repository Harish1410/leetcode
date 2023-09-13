class Solution {
    public int removeDuplicates(int[] nums) {
        int t=1;
        for(int i=1;i<nums.length;i++){
            int flag=0;
            for(int j=i-1;j>=0;j--){
                 if(nums[i]==nums[j]){
                     flag=1;
                     break;
                 } 
            }
            if(flag==0){
                nums[t++]=nums[i];
            }
        }
            
        
        return t;
    }
}