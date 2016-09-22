/**
 * Created by PraveenJoseph on 8/14/2016.
 */
public class Percentages {
    public static void main(String args[])
    {
        double a = 2.0;
        double b = 5.0;
        computePercentage(a,b);
        computePercentage(b,a);
    }

    private static void computePercentage(double a, double b) {
        double percentage = a * 100 / b;
        System.out.println(a + " is " + percentage + " percent of " + b);
    }
}
