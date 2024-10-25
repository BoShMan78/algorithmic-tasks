// https://www.codewars.com/kata/5663f5305102699bad000056/train/java

class MaxDiffLength {
    
    public static int mxdiflg(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }
        int[] minMaxA1 = findMinMax(a1);
        int a1MinLength = minMaxA1[0];
        int a1MaxLength = minMaxA1[1];
        int[] minMaxA2 = findMinMax(a2);
        int a2MinLength = minMaxA2[0];
        int a2MaxLength = minMaxA2[1];
        int abs1 = Math.abs(a1MaxLength - a2MinLength);
        int abs2 = Math.abs(a2MaxLength - a1MinLength);
        return abs1 > abs2 ? abs1 : abs2;
    }
    
    private static int[] findMinMax(String[] strings) {
        int maxLength = 0;
        int minLength = strings[0].length();
        for (String s : strings) {
            if (s.length() > maxLength) {
                maxLength = s.length();
            }
            if (s.length() < minLength) {
                minLength = s.length();
            }
        }
        return new int[]{minLength, maxLength};
    }
}
