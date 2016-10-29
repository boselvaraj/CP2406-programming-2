import java.io.BufferedInputStream;
import java.util.Scanner;

public class BabyNameComparison {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		String name1 = sc.nextLine();
		String name2 = sc.nextLine();
		String name3 = sc.nextLine();
		System.out.println(name1 + " " + name2 );
		System.out.println(name1 + " " + name3 );
		System.out.println(name2 + " " + name1 );
		System.out.println(name2 + " " + name3 );
		System.out.println(name3 + " " + name1 );
		System.out.println(name3 + " " + name2 );
		
		sc.close();
	}

}
