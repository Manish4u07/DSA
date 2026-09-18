class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        int original = x;
        int ans = 0;

        while (x != 0) {
            int rev = x % 10;
            x = x / 10;
            ans = ans * 10 + rev;
        }

        return ans == original;
    }
}