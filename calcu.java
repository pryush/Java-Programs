import java.util.*;
class calcu
{
        public static void main(String  args[])
        {
                Scanner sc = new Scanner (System.in);
                System.out.println("Enter 1st Number");
               	float a = sc.nextFloat();
               	System.out.println("Enter 2nd Number");
               	float b = sc.nextFloat();
		System.out.println("PLease choose between '*' & '/'");
               	char c = sc.next().charAt(0);
         	if(c=='*')
		{
			System.out.println(a*b);
		}
		else if(c=='/')
		{
			System.out.println(a/b);
		}
			System.out.println("Please select between '+' & '-' ");
		if(c=='+')
		{
			System.out.println(a+b);
		}
		else if(c=='-')
		System.out.println("Enter 1st number");
		float e = sc.nextFloat();
		System.out.println("Enter 2nd Number");
		float g = sc.nextFloat();
		char d = sc.next().charAt(0);
	}
}
