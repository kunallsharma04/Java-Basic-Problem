import java.util.Scanner;

public class Java005_Sum_of_2Number {
    public static void main(String[] args) 
	{
		int x, y, sum;
		
		System.out.println("Enter two Numbers :");
		
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();	
		y = sc.nextInt();
		
		sum = x + y;
		
		System.out.println("Addition of two Number is " + sum);
	}

}
