import java.util.*;
class calculator
{
	public static void main(String agrs[])
	{
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter your Two Numbers");
	int a =sc.nextInt();
	int b =sc.nextInt();
	System.out.println("Choose between '+' '-' '*' '/'");
	char c =sc.next().charAt(0);
	switch (c){
	case '+':
		System.out.println("Your answer is"+ (a+b));
		break;
	case '-':
		System.out.println("Your answer is"+ (a-b));
		break;
	case '*':
		System.out.println("Your answer is"+ (a*b));
		break;
	case '/':
		System.out.println("Your answer is = "+ (a/b));
		break;
	default:
		System.out.println("Thankyou for using");
	}
	}
}
