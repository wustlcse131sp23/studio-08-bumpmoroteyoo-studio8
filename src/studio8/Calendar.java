package studio8;
import java.util.LinkedList;

public class Calendar {

	private LinkedList<Appointment> calendar; // this is an instance variable taking in the Appointment
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Calendar() {
		this.calendar = new LinkedList<>(); // "Appointments" not needed in between "<>"
	}
	public void adding(Appointment a) {
		this.calendar.add(a);
	}
}
