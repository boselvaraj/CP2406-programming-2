
public class InchesToFeet {

	private static int inchesInfeet = 12;
	
	public static void main(String[] args) {
		
		int inches = 80;
		int feet = inches / inchesInfeet ;
		int remainingInches = inches % inchesInfeet;
		System.out.println(String.format("%d Inclues conatins %d Feet and %d inches", inches, feet, remainingInches));
	}

}
