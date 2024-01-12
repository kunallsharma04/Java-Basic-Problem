import java.util.Scanner;

public class Java006_Natural_Number {
    public static void main(String[] args) 
	{
		int n;
		
		System.out.print("Enter Number :");
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) 
		{
			System.out.print(i + " ");
		}
	}
}
