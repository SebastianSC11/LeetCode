class Solution {
    public boolean isPalindrome(int x) {
        String  x_string = String.valueOf(x), reverse_string = "";
        int length = x_string.length(), reverse = 0;
        for (int i = length; i > 0; i--){
            String ch = x_string.substring(i - 1, i);
            reverse_string += ch;
        }

        try {
            reverse = Integer.parseInt(reverse_string);
        } catch (NumberFormatException e){
            return false;
        }
        if (reverse == x){
            return true;
        }
        return false;
    }
}