package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateNtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println(date.getTime());
		System.out.println(date.getMonth()+1);
		System.out.println(date.getYear()+1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/mm/dd");
		System.out.println(sdf.format(date));
		
	}

}
