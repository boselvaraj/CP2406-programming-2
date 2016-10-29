import java.io.BufferedInputStream;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		System.out.println("Enter No of inches to convert: \n");
		
		int number = sc.nextInt();
		
		if(number%2 == 0)
			System.out.println(number + " is even");
		else
			System.out.println(number + " is odd");
		
		sc.close();

	}

}
