import java.util.Scanner;

public class Java013_ASCII_of_Character {
    public static void main(String[] args) 
	{
		char ch;
		 
		System.out.print("Enter any Character : ");
		
		Scanner sc = new Scanner(System.in);
		
		ch = sc.next().charAt(0);
		
		int a = ch;
		
		System.out.println(" ASCII value of " + ch + " is " + a);
		
	}
}
