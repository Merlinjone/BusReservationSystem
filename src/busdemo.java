import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
public class busdemo {
    public static void main(String args[]) throws ParseException {
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<booking> Booking = new ArrayList<booking>();
        buses.add(new Bus(2, true, 1));
        buses.add(new Bus(4, false, 45));
        buses.add(new Bus(1, true, 45));
        buses.add(new Bus(3, false, 45));
        int userOption = 1;
        Scanner sc = new Scanner(System.in);

        for (Bus b : buses) {
            b.displayBusinfo();
        }

        while (userOption == 1) {
            System.out.println("Enter 1 to print 2 to exit:");
            userOption = sc.nextInt();
            if (userOption == 1) {
                booking book = new booking();
                if (book.isAvailable(Booking, buses)){
                    Booking.add(book);
                    System.out.println("your booking is confirmed");
                }
                else
                System.out.println("seat filled");
                }

            }
        }
    }

