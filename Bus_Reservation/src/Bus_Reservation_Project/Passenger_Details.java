package Bus_Reservation_Project;

public class Passenger_Details {
	
	// Here get passenger details	
	private String  passengerName;
	private int bookedSeats;
	
	Passenger_Details(String passengerName)
	{
		this.passengerName = passengerName;
		this.bookedSeats = 0;
	}
	public String getPassengerName()
	{
		return passengerName;
	}
	
	public int getBookedSeats()
	{
		return bookedSeats;
	}
	
	public void bookSeats(int numSeats)
	{
		 bookedSeats += numSeats;
	}
	
	public void CancelSeats(int cancelSeat)
	{
		bookedSeats -= cancelSeat;
	}
}
