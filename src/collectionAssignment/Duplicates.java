package collectionAssignment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {

	static List<Integer>getDuplicateList(List<Integer> list)
	{
		Set<Integer> s=new HashSet<Integer>();
		for(Integer i: list)
		{
			if(s.add(i)==false)
			System.out.println(i+"is duplicated");	
		}
		return  list;
	}
	public static void main(String args[])
	{
		List<Integer> list= new ArrayList();
		list.add(33);
		list.add(45);
		list.add(55);
		list.add(33);
		list.add(45);
		
		getDuplicateList(list);
		
	}
}
