import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DistanceFromAverage {

	public static void main(String[] args) {
		List<Double> a = new ArrayList<>();
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		double number;
		number = sc.nextDouble();
		double sum = 0;		
		do 
		{
			a.add(number); 
			sum = sum+ number;
			number = sc.nextDouble();
		}while (number!= 999);
		
		double avg = sum/a.size();
		System.out.println("Average : " + avg);
		for (Double num : a)
		{
			System.out.println(num);
			System.out.println("Distance from Average : " + Math.abs(num - avg));
		}
		sc.close();
		
	}

}
