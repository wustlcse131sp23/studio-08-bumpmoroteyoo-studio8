package studio8;
import java.util.LinkedList;
import java.util.Objects;

public class Appointment {

	private Date date;
	private Time time;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date testDate = new Date(4, 6, 2023, true);
		Time testTime = new Time(7, 30, false);
		Appointment testAppointment = new Appointment(testDate, testTime);
		System.out.println(testAppointment);
	}
public Appointment(Date date, Time time) {
	this.date = date;
	this.time = time;
}
@Override
public int hashCode() {
	return Objects.hash(date, time);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Appointment other = (Appointment) obj;
	return Objects.equals(date, other.date) && Objects.equals(time, other.time);
}
@Override
public String toString() {
	return "Appointment on " + date + " at " + time;
}

}
