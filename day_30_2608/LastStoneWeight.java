// https://leetcode.com/problems/last-stone-weight/submissions/1368994358/

class Solution {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }
        sortArray(stones);
        int i = stones.length - 1;
        while(stones[i - 1] != 0){
            if (stones[i] == stones[i - 1]) {
               stones[i] = 0;
               stones[i - 1] = 0;
           } else {
               stones[i] = stones[i] - stones[i - 1];
               stones[i - 1] = 0;
           }
           
       }
        return stones[i];
    }

    public int[] sortArray(int[] stones) {
        boolean isSwapped = false;
        for (int i = 0; i < stones.length; i++) {
            isSwapped = false;
            for (int j = 1; j < stones.length - i; j++) {
                int temporary;
                if (stones[j] < stones[j - 1]) {
                    temporary = stones[j];
                    stones[j] = stones[j - 1];
                    stones[j - 1] = temporary;
                    isSwapped=true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
        return stones;
    }
}
