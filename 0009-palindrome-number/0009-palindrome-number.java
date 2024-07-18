class Solution {
    public static boolean Palindrome(int number) {
         int rev=0;
        int temp=number;
        while(temp>0){
            int digit=temp%10;
            rev=rev*10+digit;
            temp=temp/10;
        }
        return number==rev;
    }
    public boolean isPalindrome(int x){
        if(Palindrome(x)){
            return true;
        }
        else{
            return false;
        }
    }
}