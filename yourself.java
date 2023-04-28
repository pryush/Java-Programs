import java.util.*;
class yourself
{
	public static void main(String agrs[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a four digit number");
	int sum =0;
	int a = sc.nextInt();
	int mod =(a%10);
	 sum = sum+mod;
	 a = (a/10);
	 mod = (a%10);
	 sum = sum+mod;
	 a = (a/10);
	 mod =(a%10);
	 sum = sum+mod;
	 a = (a/10);
	 sum =sum+a;
	System.out.println("Sum of inputed digit is = "+sum);
	}
}
