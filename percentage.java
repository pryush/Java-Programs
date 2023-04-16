import java.util.*;
class percentage
{
	public static void main(String args[])
	{
		System.out.println("Enter Subjects Marks");
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Marks of English: ");
		float a = sc.nextFloat();
		System.out.print("Enter Marks of Biology: ");
		float b = sc.nextFloat();
		System.out.print("Enter Marks of Physics: ");
		float c = sc.nextFloat();
		System.out.print("Enter Marks of Chemistry: ");
		float d = sc.nextFloat();
		System.out.print("Enter Marks of Maths: ");
		float e = sc.nextFloat();
		float sum = (a+b+c+d+e);
		System.out.println("Your Percentage is: "+(sum/500)*100);
 	}
}
