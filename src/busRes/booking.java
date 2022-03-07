package busRes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class booking {
    String passengerName;
    int busNo;
    Date date;

    booking(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of Passenger: ");
        passengerName = sc.next();
        System.out.println("Enter Bus Number: ");
        busNo = sc.nextInt();
        System.out.println("Enter date(dd-mm-yyyy): ");
        String dateInput = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try{
            date = dateFormat.parse(dateInput);
        }catch(ParseException e){
            e.printStackTrace();
        }
    }

    public boolean isAvailabilty(ArrayList<booking> bookings, ArrayList<bus> buses){
        int capacity = 0;
        for(bus b: buses){
            if(b.getBusNo() == busNo){
                capacity = b.getCapacity();
            }
        }

        int booked = 0;
        for(booking b: bookings){
            if(b.busNo == busNo && b.date.equals(date)){
                booked++;
            }
        }

        return booked<capacity?true:false;
    }
}
