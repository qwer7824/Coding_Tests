class Solution {
    public int solution(int n) {
        
        for (long x = 2; x <= n; x++) {
            if (n % x == 1) {
                return (int) x;
            }
        }
        return n;
}
}