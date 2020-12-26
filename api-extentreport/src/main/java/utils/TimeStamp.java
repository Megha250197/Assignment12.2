package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStamp {
	public static String getCurrentDateTime() {

		DateFormat customFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		Date currentDate=new Date();
		return customFormat.format(currentDate);
	}

}
