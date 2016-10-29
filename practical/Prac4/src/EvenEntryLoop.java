import java.io.BufferedInputStream;
import java.util.Scanner;

public class EvenEntryLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		int number;
		number = sc.nextInt();
		do {
		 
		 if(number % 2 == 0)
			 System.out.println("Good Job!");
		 else
			 System.out.println("Error!!!!");
		 System.out.println("Enter another number");
			 
			 number = sc.nextInt();
		}while (number!= 999);
		sc.close();
	}

}
