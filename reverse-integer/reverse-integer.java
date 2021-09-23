class Solution {
    public int reverse(int x) {
        
    int reversed = 0;

        while(x!=0){
            try {
                // same as reversed = reversed*10 + x%10;
                reversed = Math.addExact(Math.multiplyExact(reversed,10), x%10);
                x = x/10;
            } catch (ArithmeticException e) {
                return 0;
            }
        }
        return reversed;
    }
}