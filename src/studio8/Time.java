package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean format;//military time
	
	
	public Time(int hour, int minute, boolean format) {
		this.hour = hour;
		this.minute = minute;
		this.format = format;
	}
	
	
	@Override
	public String toString() {
		if(format) {
		return "Time :" + hour + ":" + minute + ", Military time=" + format;
		}
		else if (hour>12){
			return "Time :" + (hour-12) + ":" + minute + ", Military time=" + format;
		}
		else {
			return "Time :" + hour + ":" + minute + ", Military time=" + format;
		}
	}


	public static void main(String[] args) {
		Time time1 = new Time(14, 48, true);
		Time time2 = new Time(14, 48, false);
		System.out.println(time1.equals(time2));
		System.out.println(time1 + " " + time2);
    }


	@Override
	public int hashCode() {
		return Objects.hash(format, hour, minute);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return format == other.format && hour == other.hour && minute == other.minute;
	}

}