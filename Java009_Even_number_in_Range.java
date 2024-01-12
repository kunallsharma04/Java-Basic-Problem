import java.util.Scanner;

public class Java009_Even_number_in_Range {
    public static void main(String[] args) 
		{
			int n;
			
			System.out.print("Enter Range :");
			
			Scanner sc = new Scanner(System.in);
			
			n = sc.nextInt();		
			
			for (int i = 0; i <= n; i=i+2) 
			{
				System.out.println(i);
				
			}
		}
}
