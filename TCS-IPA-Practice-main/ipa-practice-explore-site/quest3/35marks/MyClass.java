import java.util.Scanner;

class Hotel {
    private int hotelId;
    private String hotelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String wifiFacility;
    private double totalBill;

    public Hotel(int hotelId, String hotelName, String dateOfBooking,
                 int noOfRoomsBooked, String wifiFacility, double totalBill) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.wifiFacility = wifiFacility;
        this.totalBill = totalBill;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(String dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public int getNoOfRoomsBooked() {
        return noOfRoomsBooked;
    }

    public void setNoOfRoomsBooked(int noOfRoomsBooked) {
        this.noOfRoomsBooked = noOfRoomsBooked;
    }

    public String getWifiFacility() {
        return wifiFacility;
    }

    public void setWifiFacility(String wifiFacility) {
        this.wifiFacility = wifiFacility;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }
}


public class MyClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hotel[] hotels = new Hotel[4];

        for (int i = 0; i < 4; i++) {

            int hotelId = sc.nextInt();
            sc.nextLine();

            String hotelName = sc.nextLine();

            String dateOfBooking = sc.nextLine();

            int noOfRoomsBooked = sc.nextInt();
            sc.nextLine();

            String wifiFacility = sc.nextLine();

            double totalBill = sc.nextDouble();
            sc.nextLine();

            hotels[i] = new Hotel(
                    hotelId,
                    hotelName,
                    dateOfBooking,
                    noOfRoomsBooked,
                    wifiFacility,
                    totalBill
            );
        }

        String month = sc.nextLine();
        String wifiOption = sc.nextLine();


        int totalRooms =
                noOfRoomsBookedInGivenMonth(hotels, month);

        if (totalRooms > 0) {
            System.out.println(totalRooms);
        } else {
            System.out.println("No rooms booked in the given month");
        }


        Hotel result =
                searchHotelByWifiOption(hotels, wifiOption);

        if (result != null) {
            System.out.println(result.getHotelId());
        } else {
            System.out.println("No such option available");
        }

        sc.close();
    }


    public static int noOfRoomsBookedInGivenMonth(
            Hotel[] hotels, String month) {

        int totalRooms = 0;

        for (Hotel hotel : hotels) {

            /*
             date format = dd-mon-yyyy

             Example:
             11-May-2022

             split("-") gives:
             [0] = 11
             [1] = May
             [2] = 2022
            */

            String[] parts = hotel.getDateOfBooking().split("-");

            if (parts[1].equalsIgnoreCase(month)) {
                totalRooms += hotel.getNoOfRoomsBooked();
            }
        }

        return totalRooms;
    }


    public static Hotel searchHotelByWifiOption(
            Hotel[] hotels, String wifiOption) {

        Hotel highest = null;
        Hotel secondHighest = null;

        for (Hotel hotel : hotels) {

            if (hotel.getWifiFacility().equalsIgnoreCase(wifiOption)) {

                if (highest == null ||
                        hotel.getTotalBill() > highest.getTotalBill()) {

                    secondHighest = highest;
                    highest = hotel;

                } else if (secondHighest == null ||
                        hotel.getTotalBill() > secondHighest.getTotalBill()) {

                    secondHighest = hotel;
                }
            }
        }

        return secondHighest;
    }
}