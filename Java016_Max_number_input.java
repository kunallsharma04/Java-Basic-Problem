import java.util.Scanner;

public class Java016_Max_number_input {
    public static void main(String[] args) 
	{
		int a, b;
		
		System.out.print("Enter two Numbers : ");
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		b = sc.nextInt();
		
		if (a > b) 
		{
			System.out.println(a);
		} 
		else 
		{
			System.out.println(b);
		}
		
	}
}
