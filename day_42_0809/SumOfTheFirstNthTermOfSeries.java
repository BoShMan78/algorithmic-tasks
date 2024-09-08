// https://www.codewars.com/kata/555eded1ad94b00403000071

public static String seriesSum(int n) {
    if (n == 0) {
        return "0.00";
    }
    float sum = 1f;
    for (int i = 0; i < n - 1; i++) {
        sum += 1f / (4 + i * 3);
    }
    sum = Math.round(sum * 100) / 100.0f;
    return String.format("%.2f", sum);
}
