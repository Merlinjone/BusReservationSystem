import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
public class booking {
    String passengername;
    int busNo;
    Date date;
    Scanner sc=new Scanner(System.in);
    booking() throws ParseException {
        System.out.println("Enter your name:");
        passengername=sc.nextLine();
        System.out.println("Enter Bus number:");
        busNo=sc.nextInt();
        System.out.println("Enter date(dd-mm-yyyy):");
        String dateInput =sc.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        date=dateFormat.parse(dateInput);
    }
    public boolean isAvailable(ArrayList<booking>bookings,ArrayList<Bus>buses){
        int capacity=0;
        for (Bus bus:buses) {
            if(bus.getbusNo()==busNo)
                capacity=bus.getCapacity();

        }
        int booked=0;
        for (booking b:bookings) {
            if(b.busNo==busNo && b.date.equals(date)){
                booked++;
            }

        }
        return booked<capacity?true:false;
    }
}
