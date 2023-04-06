package studio8;

import java.util.Objects;
import java.util.HashSet;
import java.util.LinkedList;

public class Date {
	private int month;
	private int day;
	private int year;
	private boolean holiday;

	
	public Date(int month, int day, int year, boolean holiday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.holiday = holiday;
	}
	
	@Override
	public String toString() {
		return "Date :" + month + "/" + day + "/" + year;
	}

	public static void main(String[] args) {
		Date date1 = new Date(12, 27, 2002, false);
		Date date2 = new Date(12, 27, 2002, false);
		Date date3 = new Date(2, 14, 2002, true);
		Date date4 = new Date(2, 14, 2002, false);
		System.out.println(date1.equals(date2));
		
		LinkedList<Date> list = new LinkedList<Date>();

		list.add(date1);
		list.add(date2);
		list.add(date3);
		list.add(date4);
		System.out.println(list);
		
		HashSet<Date> set = new HashSet<Date>();
		
		set.add(date1);
		set.add(date2);
		set.add(date3);
		set.add(date4);
		System.out.println(set);
    }

	@Override
	public int hashCode() {
		return Objects.hash(day, holiday, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && holiday == other.holiday && month == other.month && year == other.year;
	}
	
}
