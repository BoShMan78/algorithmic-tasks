// https://www.codewars.com/kata/5506b230a11c0aeab3000c1f/solutions/java

public static int evaporator(double content, double evap_per_day, double threshold) {
        double thresholdInMl = content * threshold / 100;
        double mlLeft = content;
        int days = 0;
        while (mlLeft >= thresholdInMl) {
            mlLeft = mlLeft * (100 - evap_per_day) / 100;
            days++;
        }
        return days;
}
