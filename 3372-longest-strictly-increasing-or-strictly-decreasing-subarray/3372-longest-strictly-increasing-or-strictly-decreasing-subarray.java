class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1,incMax=1,decMax=1;
        for(int i=0;i<nums.length-1;i++){
            int temp=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>=nums[j-1])break;
                temp++;
            }
            incMax=Math.max(temp,incMax);
        }
        if(incMax==nums.length) return incMax;
        for(int i=0;i<nums.length-1;i++){
            int temp=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<=nums[j-1])break;
                temp++;
            }
            decMax=Math.max(temp,decMax);
        }
        return Math.max(incMax,decMax);
    }
}