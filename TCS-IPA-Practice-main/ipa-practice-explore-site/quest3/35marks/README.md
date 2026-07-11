# Java assessment 3

## Question 2

Create a class Hotel with the below attributes:

hotelld - int

hotelName - String

dateOfBooking-String (in the format dd-mon-yyyy)

noOfRoomsBooked-int

wifiFacility-String

totalBill-double

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class Solution with main method.

Implement two static methods - noOfRoomsBookedInGivenMonth and searchHotelBy WifiOption in Solution class.

### noOfRoomsBookedInGivenMonth method:

This method will take two input parameter array of Hotel objects and a String parameter.

The method will return the total numbers of rooms booked from array of Hotel objects for the given month(String parameter passed).

If no rooms are booked for the given month in the array of Hotel objects, then the method should return 0.

### searchHotelBy WifiOption method:

This method will take two input parameter array of Hotel objects and a String parameter

The method will return Hotel object with second highest totalbill, from the array of Hotel objects where wifiFacility attribute matches with the given wifi facility(String parameter passed).

If no Hotel with the given wifi option is present in the array of Hotel objects, then the method should return null.

**Note:**

- No two Hotel object would have the same hotelld.
- No two Hotel object would have the same totalbill.
- The Array either has at least two objects with specified wifi option
- OR no object with specified wifi option.
- All the searches should be case insensitive.
- dateOfBooking is stored in the format dd-mon-yyyy(eg. 01-Jan-2022)
- The above mentioned static methods should be called from the main method.

For noOfRoomsBookedInGivenMonth method The main method should print the total number of booked rooms as it is, if the returned value is greater than 0, else it should print "No rooms booked in the given month"

For searchHotelBy WifiOption method - The main method should print the hotelld from the returned Hotel object if the returned value is not null.

If the returned value is null then it should print "No such option available"

Before calling these static methods in main, use Scanner object to read the values of four Hotel objects referring attributes in the above mentioned attribute sequence.

Next, read the value of two String parameters for capturing the month and wifi option.

Consider below sample input and output:

### Input1:

```text
101

Best Stay

01-jan-2022

10

Yes

20000

102

Apple Stay

12-Feb-2022

3

Yes

4000

103

Accord

11-May-2022

5

Yes

15000

104

Royal Park

22-Dec-2021

7

Yes

12000

May

Yes
```

### Output1:

```text
5

103
```

### Input2:

```text
101

Best Stay

01-jan-2022

10

Yes

20000

102

Apple Stay

12-Feb-2022

3

Yes

4000

103

Accord

11-May-2022

5

Yes

15000

104

Royal Park

22-Dec-2021

7

Yes

12000

May1

Yes1
```

### Output2:

```text
No rooms booked in the given month

No such option available
```

### Sample code snippet for reference:

Please use below code to build your Solution.

```java
import java.util.Scanner;

public class Solution

{

public static void main(String[] args)

{

//code to read values

//code to call required method

//code to display the result

}

//code the first method

//code the second method

}

//code the class
```

### Note on using Scanner object:

Sometimes scanner does not read the new line character while invoking methods like nextInt(), nextDouble() etc.

Usually, this is not an issue, but this may be visible while calling nextLine() immediately after those methods.

Consider below input values:

```text
1001

Savings
```

Referring below code:

Referring below code:

```java
Scanner sc = new Scanner(System.in);

int x = sc.nextInt();

String str = sc.nextLine(); -> here we expect str to have value

Savings. Instead it may be "".
```

If above issue is observed, then it is suggested to add one more explicit call to nextLine() after reading numeric value.

### Instruction:

Kindly mention class name as MyClass

---

# Solution

```java
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
```