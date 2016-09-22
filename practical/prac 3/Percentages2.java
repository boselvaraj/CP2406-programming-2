import java.util.Scanner;

/**
 * Created by PraveenJoseph on 8/14/2016.
 */
public class Percentages2 {
    public static void main(String args[])
    {
        double a;
        double b;
        a = getNum();
        b = getNum();
        computePercentage(a,b);
        computePercentage(b,a);
    }
    public static double getNum()
    {
        double num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        num = input.nextDouble();
        return num;
    }

    private static void computePercentage(double a, double b) {
        double percentage = a * 100 / b;
        System.out.println(a + " is " + percentage + " percent of " + b);
    }
}
