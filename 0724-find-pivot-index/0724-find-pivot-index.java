class Solution {
    public int pivotIndex(int[] nums) {
        int prefix[]=new int[nums.length];
        int suffix[]=new int[nums.length];
        prefix[0]=nums[0];
        suffix[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        for(int i=nums.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(prefix[i]==suffix[i])return i;
        }
        return -1;
    }
}