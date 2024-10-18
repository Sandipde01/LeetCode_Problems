class Solution {
    public int countDigits(int num) {
        int copy=num;
        int dig=0;
        int count=0;
        while(num!=0){
            dig=num%10;
            num/=10;
            if(copy%dig==0){
               count++;
            }
        }
        return count;
    }
}