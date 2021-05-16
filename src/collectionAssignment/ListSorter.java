package collectionAssignment;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class ListSorter
	{
	public static void sortInList(List<Integer> inputList)
		{
		  System.out.println("ascending order");
	   for(Integer i:inputList)
	   {
		 
		   System.out.println(i);
		  
	   }

	 
	}
	public static void main(String[] args)
	{
		List<Integer> inputList=new ArrayList<Integer>();
		inputList.add(4);
		inputList.add(2);
		inputList.add(1);
		inputList.add(3);
		inputList.add(5);
		
		Collections.sort(inputList);
		sortInList(inputList);
	}
	}
	