class Solution {
    public boolean isPalindrome(int x) {
        int reversedNumber = 0, originalNumber = x;
        while (x > 0){
            int remainder = x % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            x /= 10;
        }
        return reversedNumber==originalNumber;
    }
}