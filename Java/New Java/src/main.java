import java.util.*;
/***********************************************************************/
public class main 
{
	public static void main(String[] args)
	{
		Scanner user = new Scanner (System.in);
		System.out.println("Wassup Holmes?");
		String answer = user.nextLine();
		System.out.println(answer);
		//**************************************//
		Random num = new Random();
		System.out.println(num.nextInt(100));//number generation, like Srand
	}

}
