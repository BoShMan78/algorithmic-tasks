// https://leetcode.com/problems/baseball-game/submissions/1351960538/

class Solution {
    public int calPoints(String[] operations) {
        List<Integer> scores = new ArrayList<>();
        for (String operation : operations) {
            switch (operation) {
                case "D":
                    int doubleScore = scores.get(scores.size() - 1) * 2;
                    scores.add(doubleScore);
                    break;
                case "+":
                    int sumLastTwo = scores.get(scores.size() - 1) + scores.get(scores.size() - 2);
                    scores.add(sumLastTwo);
                    break;
                case "C":
                    scores.remove(scores.size() - 1);
                    break;
                default:
                    if (operation.matches("-?\\d+")) {
                        scores.add(Integer.parseInt(operation));
                    }
                    break;
            }
        }
        return scores.stream()
                .mapToInt(Integer::intValue).sum();
    }
}
