package collectionAssignment;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrMap {

	public static Map<Integer,String>conToMap(String[] name)
	{
		Map<Integer,String> m=new HashMap<Integer,String>();
		for(int i=0;i<name.length;i++)
		{
			m.put(i+1,name[i]);
		}
	return m;
}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
				System.out.println("enter size ofarray");
		String[] str=new String[sc.nextInt()];
		for(int i=0;i<str.length;i++)
		{
			System.out.println("enter name"+(i+1));
			str[i]=sc.next();
		}
		if(str.length==0)
		{
			System.out.println("null");
		}
		else {
			Map<Integer,String>m=conToMap(str);
			for(Map.Entry<Integer,String> x: m.entrySet())
			{
				System.out.println(x.getKey()+" "+x.getValue());
				sc.close();
			}
		}
	}	
}


