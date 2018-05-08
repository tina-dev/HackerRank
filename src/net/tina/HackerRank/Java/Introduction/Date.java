package net.tina.HackerRank.Java.Introduction;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Date
{
	public static String getDay(String day, String month, String year)
	{
		Calendar calendar = Calendar.getInstance();
		calendar.set(Integer.valueOf(day), Integer.valueOf(month)-1, Integer.valueOf(year));
		return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.GERMANY).toUpperCase();
	}
	public static void main(String [] args)
	{
		System.out.println("Vvedie mesyac");
		Scanner scanner = new Scanner(System.in);
		String month = scanner.next();
		System.out.println("vvedite den");
		String day = scanner.next();
		System.out.println("Vvedite god");
		String year = scanner.next();
		System.out.println(getDay(day, month, year));
	}
}
