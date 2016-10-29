import java.io.BufferedInputStream;
import java.util.Scanner;

public class NauticalMilesInteractive {

	private static float kmInNauticalMile = 1.852f;
	private static float milesInNauticalMile = 1.150779f;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		System.out.println("Enter No of nautical miles : \n");
		
		float nauticalMiles = sc.nextFloat();
		float km = nauticalMiles * kmInNauticalMile;
		float miles = milesInNauticalMile * nauticalMiles;
		System.out.println(String.format("%f Nautical Miles conatins %f Kilometers or %f miles", nauticalMiles,km,miles));
		
		sc.close();
	}
}
