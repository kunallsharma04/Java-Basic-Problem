import java.util.Scanner;

public class Java022_Find_Factorial_of_Number {
    public static void main(String[] args) 
	{
		int n, fact = 1;
		
		System.out.print("Enter a Number : ");
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for (int i = 1; i<= n; i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial : " + fact);
		
	}
}
