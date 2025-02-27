import model.entities.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Room number ");
            int number = sc.nextInt();
            System.out.println("Checkin date ");
            Date checkIn = sdf.parse(sc.next());
            System.out.println("Checkout date");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation " + reservation);

            System.out.println();
            System.out.println("Enter data to updtade the reservation");
            System.out.println("check in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.println("check in date (dd/MM/yyyy): ");

            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation " + reservation);

        }
        catch (ParseException e) {
            System.out.println("invalid date format");
        }
        catch (DomainException e){
            System.out.println("error in reservation" + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }

        sc.close();


    }
}