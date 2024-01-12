import java.util.Scanner;

public class Java019_power_calculation_program {
    public static void main(String[] args) 
	{
		int n,p,result=1;
		
		System.out.print("Enter any Number : ");
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		System.out.print("Enter Power : ");
		
		p = sc.nextInt();
		
		for (int i = 1; i <=p; i++) 
		{
			result = n*result;
			
		}
		
		System.out.println("Power " + result);
	}
}
