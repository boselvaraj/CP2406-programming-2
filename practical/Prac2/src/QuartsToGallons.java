
public class QuartsToGallons {

	private static int quartsInGallon = 4;
	public static void main(String[] args) {
		int quartsForPaintJob = 10;
		int gallonsForPaintJob = quartsForPaintJob / quartsInGallon;
		int remainingQuarts = quartsForPaintJob % quartsInGallon;
		System.out.println(gallonsForPaintJob + " gallons plus " + remainingQuarts + " quarts");
	}

}
