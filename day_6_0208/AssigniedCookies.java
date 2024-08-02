// https://leetcode.com/problems/assign-cookies/submissions/1341833023/

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int counter = 0;
        int assignedCookies = 0;
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (s[j] != -1 && s[j] >= g[i]) {
                    counter++;
                    assignedCookies++;
                    s[j] = -1;
                    break;
                }
            }
            if (assignedCookies == s.length || counter == g.length) {
                break;
            }
        }
        return counter;
    }
}
