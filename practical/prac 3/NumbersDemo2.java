import java.util.Scanner;

/**
 * Created by PraveenJoseph on 8/14/2016.
 */
public class NumbersDemo2 {

    public static void main(String args[])
    {
        int a;
        int b;
        a = getNum();
        b = getNum();
        displayTwiceTheNumber(a,b);
        dipslayNumberPlusFive(a, b);
        displayNumberSquared(a,b);

    }
    public static int getNum()
    {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        num = input.nextInt();
        return num;
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
