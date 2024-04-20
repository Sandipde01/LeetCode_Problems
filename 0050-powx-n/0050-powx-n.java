class Solution {
    public double Power(double x,int n){

        if(n==0){
            return 1;
        }
        double ans=Power(x,n/2);
        if(n%2!=0){
            return ans*ans*x;
        }
        return ans*ans;
    }
    public double myPow(double x, int n) {
        if(n>0){
            return Power(x,n);
        }
        else{
            return 1/Power(x,n);
        }
    }
}