class Solution {
    public int reverse(int x) {
        int reversed = 0, remainder = 0;
        while (x != 0){ // 1-Start a While loop to get digit by digit of the number
            remainder = x % 10; // 2-Get the last digit of the integer
            reversed = reversed * 10 + remainder; // 3-Build the reversed number by adding the digits
            x /= 10; // 4-Remove the (already added) last digit
        }
        return (reversed % 10 == remainder) ? reversed : 0; //5-Check if the first digit of the original number is equals to the last digit of the reversed number, and if it is return the reversed number. Otherwise return 0 
    }
}