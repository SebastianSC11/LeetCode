import java.util.Arrays;

class Solution {
    public int romanToInt(String s) {
        int length = s.length() - 1;
        int value = 0;
        for (int i=length; i >= 0; i--){
            char ch1 = s.charAt(i);
            char ch2 = (i+1 >= s.length()) ? ' ' : s.charAt(i + 1);
            switch (ch1){
                case 'I': 
                    value = (ch2 == 'V' | ch2 == 'X') ? value - 1: value + 1;
                    break;
                case 'V': 
                    value += 5;
                    break;
                case 'X':
                    value = (ch2 == 'L' | ch2 == 'C') ? value - 10 : value + 10;
                    break;
                case 'L': 
                    value += 50;
                    break;
                case 'C': 
                    value = (ch2 == 'D' | ch2 == 'M') ? value - 100 : value + 100;
                    break;
                case 'D': 
                    value += 500;
                    break;
                case 'M': 
                    value += 1000;
                    break;
            }
        }
        return value;
    }
}