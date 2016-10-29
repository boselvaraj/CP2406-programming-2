
public class NauticalMiles {

	private static float kmInNauticalMile = 1.852f;
	private static float milesInNauticalMile = 1.150779f;
	
	public static void main(String[] args) {
		float nauticalMiles = 10.0f;
		float km = nauticalMiles * kmInNauticalMile;
		float miles = milesInNauticalMile * nauticalMiles;
		System.out.println(String.format("%f Nautical Miles conatins %f Kilometers or %f miles", nauticalMiles,km,miles));
	}

}
