import java.util.ArrayList;


public class Driver 
{


	public static void main(String[] args) 
	{
		ArrayList<Integer> alist = new ArrayList <Integer>();
		
		for(int i=0;i<100;i++)
		{
		alist.add(7);//0
		alist.add(3);//1
		alist.add(4);//2
		alist.add(18);//3
		alist.add(87);//4
		alist.add(56);//5
		alist.add(32);//6
		}
		System.out.println(alist.get(2));
		System.out.println(alist.size());
	}

}
