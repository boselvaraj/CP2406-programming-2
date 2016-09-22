/**
 * Created by PraveenJoseph on 8/14/2016.
 */
public class NumbersDemo {

    public static void main(String args[])
    {
        int a = 10;
        int b = 20;
        displayTwiceTheNumber(a,b);
        dipslayNumberPlusFive(a, b);
        displayNumberSquared(a,b);

    }

    private static void displayNumberSquared(int a, int b) {
        System.out.println("Number Squared");
        System.out.println("Number One = " + a + " Result = " + (a*a));
        System.out.println("Number Two = " + b + " Result = " + (b*b));
    }

    private static void dipslayNumberPlusFive(int a, int b) {
        System.out.println("Number Plus Five");
        System.out.println("Number One = " + a + " Result = " + (a+5));
        System.out.println("Number Two = " + b + " Result = " + (b+5));

    }

    private static void displayTwiceTheNumber(int a, int b) {
        System.out.println("Twice The Number");
        System.out.println("Number One = " + a + " Result = " + (a+a));
        System.out.println("Number Two = " + b + " Result = " + (b+b));
    }

}
