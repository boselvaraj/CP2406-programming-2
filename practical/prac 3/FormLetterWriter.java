/**
 * Created by PraveenJoseph on 8/14/2016.
 */
public class FormLetterWriter {
    public static void main(String args[])
    {

        displaySalutation("Zuckerberg");
        System.out.println("Thank you for your recent order");
        displaySalutation("Mark", "Zuckerberg");
        System.out.println("Thank you for your recent order");
    }

    public static void displaySalutation(String lastName)
    {
        System.out.println("Dear Mr. or Ms. " + lastName);
    }
    public static void displaySalutation(String firstName, String lastName)
    {
        System.out.println("Dear " + firstName + " " + lastName);
    }
}
