class Solution {
     void reverse(int []nums,int i,int j)
        {
            while(i<=j)
            {   int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }
    public void nextPermutation(int[] nums) {
        int indx1=-1;
        int indx2=0;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                indx1=i;
                break;

            }

        }
        if(indx1==-1) {reverse(nums,0,nums.length-1);
        return;
        }
       
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]>nums[indx1])
            {
                indx2=i;
                break;
            }
        }
        int val=nums[indx1];
        nums[indx1]=nums[indx2];
        nums[indx2]=val;
        reverse(nums,indx1+1,nums.length-1);

    }
}