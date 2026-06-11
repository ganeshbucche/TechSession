class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false; 

        int original = x;
        int reverse_num = 0;

        while (x > 0) {
            int digit = x % 10;
            reverse_num = reverse_num * 10 + digit;
            x = x / 10;
        }

        return original == reverse_num;
    }
}
/*
public boolean isPalindrome(int x){
if(x < 0) return false;

}