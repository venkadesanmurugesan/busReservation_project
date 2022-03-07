package busRes;

import java.util.ArrayList;
import java.util.Scanner;

public class busDemo {
    public static void main(String[] args){
        ArrayList<bus> buses = new ArrayList<bus>();
        ArrayList<booking> bookings = new ArrayList<booking>();

        buses.add(new bus(1,true,2));

        int userOpt = 1;
        Scanner sc = new Scanner(System.in);

        for (bus b:buses) {
            b.displayBusInfo();
        }
        while(userOpt == 1){
            System.out.println("Enter 1 to Book and 2 to exit: ");
            userOpt = sc.nextInt();
            if(userOpt == 1){
                booking Booking = new booking();
                if(Booking.isAvailabilty(bookings,buses)){
                    bookings.add(Booking);
                    System.out.println("Your Booking is Confirmed");
                }else{
                    System.out.println("Sorry. Bus is full. Try another bus or date.");
                }
            }else{
                System.out.println("Exit");
            }
        }
    }
}
