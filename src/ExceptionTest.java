import java.util.Scanner;


public class ExceptionTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Enter mobile no.");
		long mobile  = sc.nextLong();
		System.out.println("Enter the age");
		int age = sc.nextInt();
		if(age<20 || age>55)
			try {
				throw new AgeNotSufficient();
			} catch (AgeNotSufficient e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
