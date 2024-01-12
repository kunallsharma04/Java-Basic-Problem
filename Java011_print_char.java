import java.util.Scanner;

public class Java011_print_char {
    public static void main(String[] args) 
	{
		char ch;
		
		System.out.print("Enter Character : ");
		
		Scanner sc = new Scanner(System.in);
		
		ch = sc.next().charAt(0);
		
		System.out.println("You Enter this Character : " + ch);
		
	}
}
