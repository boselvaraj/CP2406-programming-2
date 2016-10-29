import java.io.BufferedInputStream;
import java.util.Scanner;

public class AscendingAndDescending {

	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		System.out.println("Enter No of inches to convert: \n");
		
		int number = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		
		if(number > number2)
		{
			if(number > number3)
			{
				if(number2>number3)
				{
					System.out.println("Descending :" + number + ", " + number2 + ", " + number3);
					System.out.println("Ascending :" + number3 + ", " + number2 + ", " + number);
				}
				else
				{
					System.out.println("Descending : " + number + ", " + number3 + ", " + number2);					
					System.out.println("Ascending : " + number2 + ", " + number3 + ", " + number);					
				}
			}
			else
			{
				System.out.println("Descending : " + number3 + ", " + number + ", " + number2);
				System.out.println("Ascending : " + number2 + ", " + number + ", " + number3);
			}
		}
		else
		{
			if(number2 > number3)
			{
				if(number > number3)
				{	
					System.out.println("Descending : " + number2 + ", " + number + ", " + number3);
					System.out.println("Ascending : " + number3 + ", " + number + ", " + number2);
				}
				else
				{
					System.out.println("Descending : " + number2 + ", " + number3 + ", " + number);
					System.out.println("Ascending : " + number + ", " + number3 + ", " + number2);
				}
			}
			else
			{
				System.out.println("Descending : " + number3 + ", " + number2 + ", " + number);
				System.out.println("Ascending : " + number3 + ", " + number2 + ", " + number);
			}
		}

	}

}
