package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class ClientCare_Java_Utility {
	
	/**
	 * This method used to generate the random number
	 * @return 
	 */
	public int randomNumber() {
		Random random=new Random();
		int randomNumber = random.nextInt(1000);
		return randomNumber;
	}
	
	/**
	 * This method is used to get the system date
	 * @return 
	 */
	public String toGetSystemDateYYYYMMDD() {
		Date dateobj=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-DD");
		String date = sdf.format(dateobj);
		return date;
	}
	
	/**
	 * This method is used to get the End date for the end 
	 * @return 
	 */
	public String toGetSystemEndDate(int days) {
		Date dateobj=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-DD");
		sdf.format(dateobj);
		
		Calendar cal=sdf.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String enddate = sdf.format(cal.getTime());
		return enddate;
	}
	/**
	 * This method is used to get the system date and time (alternate method)
	 * @return 
	 */
	public String toGetSystemDateAndTime() {
		Date d=new Date();			
		String[] date = d.toString().split(" ");
		String day=date[0];
		String month=date[1];
		String date1=date[2];
		String time=date[3].replace(':', '_');
		String year=date[5];
		
		String finalDate= day+" "+month+" "+date1+" "+time+" "+year;
		return finalDate;
		
	}
	
	
	
	
	
	
	
	
	
}
