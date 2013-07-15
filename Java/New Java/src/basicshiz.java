import java.util.*;
/***********************************************************************/
public class main 
{
	public static void main(String[] args)
	{
		Scanner user = new Scanner (System.in);
		System.out.println("Wassup Holmes?");//asks question
		String answer = user.nextLine();//declares answer is user, will print next line, stores scanner user as string answer
		System.out.println(answer);//returns question
		//**************************************//
		Random num = new Random();
		System.out.println(num.nextInt(100));//number generation, like Srand
	}

}
