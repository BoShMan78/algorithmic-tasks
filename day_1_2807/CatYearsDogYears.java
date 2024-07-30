// https://www.codewars.com/kata/5a6d3bd238f80014a2000187

public class Dinglemouse {

  public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
    int catRealAge = toRealAge(catYears, 4);
        int dogRealAge = toRealAge(dogYears, 5);
        return new int[]{catRealAge, dogRealAge};
    }

    private static int toRealAge(int petYears, int ratio) {
        int realAge;
        if (petYears >= 24) {
            realAge = ((petYears - 24) / ratio) + 2;
        } else if (petYears >= 15) {
            realAge = 1;
        } else realAge = 0;
        return realAge;
    }
}
