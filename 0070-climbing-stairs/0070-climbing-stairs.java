class Solution {
    public int climbStairs(int n) {
        int step[]=new int[n];
        Arrays.fill(step,-1);
        return solve(n,step);
    }
   static int solve (int n,int []arr){
    
    if(n<0){
        return 0;
    }
    if(n==0){
        return 1;
    }
    if(arr[n-1]!=-1){
        return arr[n-1];
    }
    arr[n-1]=solve(n-1,arr)+solve(n-2,arr);
    return arr[n-1];
   }
}