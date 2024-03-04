package Bus_Reservation_Project;
public class Bus_Detailes {
	
	private String from;
	private String to;
	private String busNumber;
	private int availableSeats;
	private int busCapacity;
	
	// Initialize the bus details 
	Bus_Detailes(String from,String to,String busNum,int busCapac )
	{
		this.from = from;
		this.to = to;
		this.busNumber = busNum;
		this.availableSeats = busCapac;
		this.busCapacity = busCapac;
	}
	
	// Make the getter and setter to access the data
	public String getFrom()
	{
		return from;
	}
	
	public void setFrom(String from)
	{
		this.from = from;
	}
	public String getTo()
	{
		return to;
	}
	
	public void setTo(String to)
	{
		this.to = to;
	}
	public String getBusNumber()
	{
		return busNumber;
	}
	public void setbusNumber(String busNum)
	{
		this.busNumber = busNum;
	}
	public int getAvailableSeats()
	{
		return availableSeats;
	}
	
	public void setAc(int availableSeats)
	{
		this.availableSeats = availableSeats;
	}
	public int getBusCapcity()
	{
		return busCapacity;
	}
	public void setCapacity(int busCapac)
	{
		this.busCapacity = busCapac;
	}
	
	//Display the initial bus information
	public void displayBusInfo()
	{
		System.out.println("**************** Bus Details ****************");
		System.out.println("\t");
		System.out.println("Bus No : " + busNumber +"\t" + "Total Capcity : " + busCapacity +"\t" + "Available Seats : " + availableSeats +"\t" + "Bus Direction : " + from +" to "+to );
		System.out.println("\t");
	}
	
	//count the reservation details and to store
	public boolean makeReservation(int numOfSeats)
	{
		if(numOfSeats>0 && numOfSeats<=availableSeats)
		{
			availableSeats -= numOfSeats;
			return true;
		}
		else
		{
			System.out.println("Not Enough Sapce");
			return false;
		}
	}
	
	// The process of cancel the tickets 
	public void cancelBookedSeat(int cancelSeat)
	{
		availableSeats += cancelSeat;
	}

}
