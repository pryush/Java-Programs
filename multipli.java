import java.util.*;
class multipli
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter 1st Number: ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd Number: ");
		int b = sc.nextInt();
		System.out.print("Enter 3rd Number: ");
		int c = sc.nextInt();
		int sum= (a*b*c);
		System.out.println("Product of these numbers is "+sum);
	}
}

