package collectionAssignment;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

 class EmpDetails {
	private Map<Integer,String>employeeIdNameMap;
	public EmpDetails()
	{
		employeeIdNameMap=new TreeMap<Integer,String>();
	}
	public EmpDetails( Map<Integer,String>employeeIdNameMap)
	{
		this.employeeIdNameMap=employeeIdNameMap;
	}
	public String getEmployeeName(int employeeId)
	{
		String str="";
		int count=0;
		if(employeeIdNameMap==null ||employeeIdNameMap.size() ==0)
		{
			return null;
		}
		else {
			if(employeeIdNameMap.containsKey(employeeId))
			{
				str=employeeIdNameMap.get(employeeId);
			}
		}
		if(str.length()==0)
		{
			return null;
		}
		else {
			return str;
		}
	}
public Map<Integer,String>getEmployeeIdNameMap()
{
	return employeeIdNameMap;
}
public void setEmployeeIdNameMap(Map<Integer,String>employeeIdNameMap)
{
	this.employeeIdNameMap=employeeIdNameMap;
}
}


public class Empdetailsmap {

	public static void main(String[] args) {
		System.out.println("enter no of details to enter");
		Scanner sc=new Scanner(System.in);
		Map<Integer,String>m=new TreeMap<Integer,String>();
		int num1=sc.nextInt();
		for(int i=0;i<num1;i++)
		{
			System.out.println("enter key and value");
			m.put(sc.nextInt(),sc.next());
		}
		EmpDetails emp= new EmpDetails(m);
		System.out.println("enter key to search");
		System.out.println(emp.getEmployeeName(sc.nextInt()));
				sc.close();

	}
}
