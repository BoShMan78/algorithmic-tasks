// https://leetcode.com/problems/min-cost-climbing-stairs/submissions/1381076118/

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if (cost.length == 2) {
            return cost[0] < cost[1] ? cost[0] : cost[1];
        }
        int[] costArray = new int[cost.length];
        costArray[0] = cost[0];
        costArray[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            costArray[i] = Math.min(cost[i] + costArray[i - 1], cost[i] + costArray[i - 2]);
        }
        return Math.min(costArray[cost.length - 1], costArray[cost.length -2]); 
    }
}
