import java.io.BufferedInputStream;
import java.util.Scanner;

public class InchesToFeetInteractive {

	private static int inchesInfeet = 12;

	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		System.out.println("Enter No of inches to convert: \n");
		
		int inches = sc.nextInt();;
		int feet = inches / inchesInfeet ;
		int remainingInches = inches % inchesInfeet;
		System.out.println(String.format("%d Inclues conatins %d Feet and %d inches", inches, feet, remainingInches));
		sc.close();

	}

}
