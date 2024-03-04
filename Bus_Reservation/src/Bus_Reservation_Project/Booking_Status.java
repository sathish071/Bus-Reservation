package Bus_Reservation_Project;

import java.util.Scanner;

public class Booking_Status {
	
	public static void main(String[] args){
		
		//Object creation for want to access the data
	
		Passenger_Details passenger = new Passenger_Details("Arun");
		Bus_Detailes bus = new Bus_Detailes("chennai", "Madurai", "TN19_1945", 40);
		String passengerName="";
		
		// Repeating the options to show customer
	while(true)
	{
		System.out.println(" Enter 1.Booking \t 2.Cancelation \t 3.Exit");
		Scanner scanner = new Scanner(System.in);
		
		
		int num = scanner.nextInt();
		if(num == 1 || num == 2 || num==3)
		{
		switch(num)
		{	
			case 1 :
				
				if(num == 1)
				{
					//Get the details from user 
					System.out.println(" ---------- Welcome To Ticket Booking season---------- ");
					System.out.println("\t ");
					bus.displayBusInfo();
										
					System.out.println("Enter Passenger Name");
					passengerName = scanner.next();
					
					System.out.println("Enter From Address");
					String from = scanner.next();
					
					System.out.println("Enter Destination Address");
					String to = scanner.next();

					System.out.println("Enter Bus Number");
					String busNumber = scanner.next();
					
					// To check the passenger details same as in bus details 
					if(from.equalsIgnoreCase(bus.getFrom()) && to.equalsIgnoreCase(bus.getTo()) && busNumber.equalsIgnoreCase(bus.getBusNumber()))
					{
						System.out.println("Enter the No Of Seats to Book ");
						
						int seatsToBook = scanner.nextInt();
						if(seatsToBook >0 && seatsToBook <= bus.getAvailableSeats())
						{
							// Here book the tickets 
							 passenger.bookSeats(seatsToBook);
							 bus.makeReservation(seatsToBook);
							 System.out.println(passenger.getBookedSeats() + " Seats Booked sucessfully.......");
							 
							 // Showing the booking seat details
							 System.out.println("Here your tickets...........");
							 System.out.println("\t");
							 System.out.println("Bus number" +"\t"+ "Passenger Name" +"\t"+ "From" +"\t"+"\t"+ "Dstination" +"\t"+ "No of Seats Booked");
							 System.out.println( bus.getBusNumber() +"\t" + passengerName +"\t"+"\t"+ bus.getFrom() +"\t"+"\t"+ bus.getTo() +"\t"+"\t"+ passenger.getBookedSeats());
							 
							 // Get available seats
							 System.out.println("\t");
							 System.out.println(bus.getAvailableSeats() + " Seats Available");
							 System.out.println("\t");

						}
						else
						{
							System.out.println("Enter positive number");
							System.out.println("\t");
						}

					}
					else
					{
						System.out.println(" ************** Please enter valid input **************");
					}
				}
						
			case 2 :
				
				if(num == 2)
				{
					//Get details from user to cancel the ticket
					System.out.println("------------- Welcom To Cancelation Season -------------");
					System.out.println("\t");
					
					System.out.println("Enter Passenger Name");
					passengerName = scanner.next();
					
					System.out.println("Enter The From Address");
					String from = scanner.next();
					
					System.out.println("Enter The To Address");
					String to = scanner.next();
					
					System.out.println("Enter The Bus Number ");
					String busNumber = scanner.next();
				
					// Verify the user details to same as bus details 
					if(from.equalsIgnoreCase(bus.getFrom()) && to.equalsIgnoreCase(bus.getTo()) && busNumber.equalsIgnoreCase(bus.getBusNumber()))
					{
						System.out.println("Enter the No Of Seats to Cancel ");
						int cancelSeats = scanner.nextInt();
						
						if(cancelSeats >0 && cancelSeats <= bus.getAvailableSeats() && cancelSeats <= passenger.getBookedSeats())
						{
							// The process of cancel the ticket 
							passenger.CancelSeats(cancelSeats);
							System.out.println("\t");
							System.out.println(cancelSeats + " Seats Cancel");
							System.out.println("\t");
							System.out.println(passenger.getBookedSeats() + " Seats Booked After Cancelation");
							System.out.println("\t");
							bus.cancelBookedSeat(passenger.getBookedSeats());		
							
							// Show the tickets after cancellation
							System.out.println("Here your tickets For After Cancelation ...........");
							System.out.println("\t");
							System.out.println("Bus number" +"\t"+ "Passenger Name" +"\t"+ "From" +"\t"+"\t"+ "Dstination" +"\t"+ "No of Seats Booked");
							System.out.println( bus.getBusNumber() +"\t" + passengerName +"\t"+"\t"+ bus.getFrom() +"\t"+"\t"+ bus.getTo() +"\t"+"\t"+ passenger.getBookedSeats());
							 
							// Available seats for after cancellation
							System.out.println("\t");
							System.out.println(bus.getAvailableSeats() + " Seats Available");
							System.out.println("\t");

						}
						else
						{
							System.out.println("Please Enter Valid Input or DO Booking first.....");
							System.out.println("\t");
						}

					}
					else
					{
						System.out.println(" ************** Please enter valid input **************");
					}
				}
				break;
				
				
			case 3 : 
				if(num == 3)
				{
					// Exit the ticket booking seasons
					System.out.println("Exciting The Bus Reservation System Thank You........");
					System.exit(0);
				}
						
			default :	System.out.println(" ************ Invalid Choise. Please Try Again ************");
			scanner.close();

		}
		}
		else
		{
			System.out.println("************** Please First Do Booking After Came to Cancel ************** ");
			System.out.println("\t");
		}
		
	}
			
	}
}
