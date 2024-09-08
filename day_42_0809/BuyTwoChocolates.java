// https://leetcode.com/problems/buy-two-chocolates/submissions/1383032846/

class Solution {
    public int buyChoco(int[] prices, int money) {
        int sum = Arrays.stream(prices)
                .sorted()
                .limit(2)
                .sum();
        int leftover = money - sum;
        return leftover >= 0 ? leftover : money;
    }
}
