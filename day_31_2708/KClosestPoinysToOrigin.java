// https://leetcode.com/problems/k-closest-points-to-origin/submissions/1370070599/

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        double[][] arrayIndexDistance = new double[points.length][2];
        for (int i = 0; i < points.length; i++) {
            arrayIndexDistance[i][0] = i;
            arrayIndexDistance[i][1] = Math.sqrt(Math.pow(points[i][0], 2) + Math.pow(points[i][1], 2));
        }
        double temporary[] = new double[2];
        for (int i = 0; i < k; i++) {
            boolean isSwapped = false;
            for (int j = arrayIndexDistance.length - 1; j > i; j--) {
                if (arrayIndexDistance[j][1] < arrayIndexDistance[j - 1][1]) {
                    temporary[0] = arrayIndexDistance[j][0];
                    temporary[1] = arrayIndexDistance[j][1];
                    arrayIndexDistance[j][0] = arrayIndexDistance[j - 1][0];
                    arrayIndexDistance[j][1] = arrayIndexDistance[j - 1][1];
                    arrayIndexDistance[j - 1][0] = temporary[0];
                    arrayIndexDistance[j - 1][1] = temporary[1];
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
        int[][] resultArray = new int[k][2];
        for (int i = 0; i < k; i++) {
            int index = (int) arrayIndexDistance[i][0];
            resultArray[i][0] = points[index][0];
            resultArray[i][1] = points[index][1];

        }
        return resultArray;
    }
}
