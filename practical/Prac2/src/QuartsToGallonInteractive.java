import java.io.BufferedInputStream;
import java.util.Scanner;

public class QuartsToGallonInteractive {

	private static int quartsInGallon = 4;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		System.out.println("Enter No of quarts for paint job : \n");
		int quartsForPaintJob = sc.nextInt();
		int gallonsForPaintJob = quartsForPaintJob / quartsInGallon;
		int remainingQuarts = quartsForPaintJob % quartsInGallon;
		System.out.println(gallonsForPaintJob + " gallons plus " + remainingQuarts + " quarts");
		sc.close();
	}

}
