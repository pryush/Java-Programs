import java.util.*;
class id
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your id");
	String str= sc.nextLine();
	System.out.println("Enter the amount of points your are having in the id mentioned above");
	int points = sc.nextInt();
	int value = 4000;
	if(points>4000){
	System.out.println("Invalid");
	return;
	}
	int leftPoints =(4000-points);
	System.out.println("Here is the amount of points left for code = "+ leftPoints);
	int days = (int)(Math.ceil((double)(leftPoints)/640));
	System.out.println("Days required to reached 4000: "+days+" days!");
	System.out.println("KEEP WORKING KEEP EARNING");
	}
}

