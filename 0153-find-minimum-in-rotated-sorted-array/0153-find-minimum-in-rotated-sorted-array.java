class Solution {
    public int findMin(int[] nums) {
        int st=0;
        int en=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(st<=en){
            int mid=st+(en-st)/2;
            if(nums[st]<=nums[mid]){
                ans=Math.min(ans,nums[st]);
                st=mid+1;
            }
            else{
                ans=Math.min(ans,nums[mid]);
                en=mid-1;
            }
        }

        return ans;
    }
}