class Solution {
    public int reverse(int x) {
        int ans=0;
        int count=0;
        while(x>0){
        count=x%10;
        ans=(ans*10)+count;
        x=x/10;
        }
        return ans;
    }
}