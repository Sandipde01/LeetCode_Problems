class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int leftmax=0;
        int rightmax=0;
        int trapped=0;
        while(l<=r){
            if(height[l]<=height[r]){
                if(height[l]>=leftmax){
             leftmax=height[l];
                }
                else{
             trapped+=leftmax-height[l];
           
                }
                  l++;
            }
            else{
                if(height[r]>=rightmax){
                 rightmax=height[r];
                }
                else{
                    trapped+=rightmax-height[r];
                  
                }
                  r--;
            }
        }
  return trapped;
    }
}