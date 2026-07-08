class Solution {
    public int maximum69Number (int num) {
        int l = (int) Math.log10(num) + 1;
        int op = 0;
        int x = (int) Math.pow(10, l - 1);
        while (x > 0) {
            int currentDigit = (num / x) % 10;
            if (currentDigit == 6) {
                op = op * 10 + 9;
                x /= 10; 
                break;
            } else {
                op = op * 10 + currentDigit;
            }
            x /= 10;
        }if (x > 0) {op = op * (x * 10);
            op += num % (x * 10);
        }
        return op;
    }
}