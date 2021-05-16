package collectionAssignment;



	import java.util.Date;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;

	public class DateCompare
	{
		static int compareDates(Date date1,Date date2)
		{
			if(date1.equals(date2))
			{
				return 0;
			}
			else if(date1.before(date2))
			{
				return 1;
			}
			else if(date1.after(date2))
			{
				return 2;
			}
			else if(date1==null || date2==null)
			{
			   return -1;
			}
			return 3;
	}
		public static void main(String args[]) throws ParseException
		{
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			Date date1=(Date) sdf.parse("24-04-21");
			Date date2=(Date) sdf.parse("25-04-21");
			
			System.out.println(DateCompare.compareDates(date1,date2));
		
			
		}
	}

