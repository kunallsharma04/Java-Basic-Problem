import java.util.Scanner;

public class Java021_Average_mark_calculate {
    public static void main(String[] args) 
	{
		int a, b, c, d, e;
		
		System.out.print("Enter Marks of Five Subjects : ");
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		
		int sum = a + b + c + d + e;
		
		System.out.print("Total marks "+ sum);
		
		double avg = sum/5.0;
		
		System.out.println("Average Marks : " + avg);
	}
}
