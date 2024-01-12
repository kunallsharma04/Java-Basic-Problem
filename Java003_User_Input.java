import java.util.Scanner;
public class Java003_User_Input {
    public static void main(String[] args) 
	{
		int a;

		Scanner sc = new Scanner(System.in);
	
        System.out.print("Enter the Value : ");
	
        a = sc.nextInt();
	
        System.out.println(a);
	}
}
