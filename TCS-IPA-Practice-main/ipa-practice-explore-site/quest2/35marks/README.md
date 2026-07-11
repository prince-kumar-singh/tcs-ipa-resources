# Java Assessment Test 2

## Question 2

Create a class Laptop with the below attributes:

- laptopId - int
- brand - String
- osType - String
- price - double
- rating - int

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class Solution with main method.

Implement two static methods **countOfLaptopsByBrand** and **searchLaptopByOsType** in Solution class.

---

## countOfLaptopsByBrand method:

This method will take two input parameters array of Laptop objects and a String parameter.

The method will return the count of laptops from array of Laptop object for the given brand(String parameter passed) whose rating is more than 3.

If no Laptop with the above condition is present in the array of Laptop objects, then the method should return 0.

---

## searchLaptopByOsType method:

This method will take two input parameters - array of Laptop objects and a String parameter.

The method will return Laptop object array in an descending order of their laptopId, from the array of Laptop objects whose os attribute matches with the given OS(String parameter passed). If no Laptop with the given OS is present in the array of Laptop objects, then the method should return null.

**Note:** No two Laptop object would have the same laptopId. All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For **countOfLaptopsByBrand** method - The main method should print the count of laptops as it is, if the returned value is greater than 0, or it should print **"The given brand is not available"**.

For **searchLaptopByOsType** method - The main method should print the laptopId and rating from the returned Laptop object array if the returned value is not null.

If the returned value is null then it should print **"The given os is not available"**.

Before calling these static methods in main, use Scanner object to read the values of Four Laptop objects referring attributes in the above mentioned attribute sequence.

Next, read two String values for capturing brand and os.

---

# Consider below sample input and output:

## TestCase1:

### Input:
```
123
HP
Windows
35000
5
124
Apple
Mac OS
70000
5
125
Dell
Ubuntu
30000
4
126
HP
windows
40000
4
HP
windows
```

### Output:
```
2
126
4
123
5
```

---

## TestCase2:

### Input:
```
123
HP
Windows
35000
5
124
Apple
Mac OS
70000
5
125
Dell
Ubuntu
30000
4
126
Asus
windows
40000
3
HP1
Ubuntul
```

### Output:
```
The given brand is not available
The given os is not available
```

---

# Sample code snippet for reference:

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

---

# Note on using Scanner object:

Sometimes scanner does not read the new line character while invoking methods like `nextInt()`, `nextDouble()` etc. Usually, this is not an issue, but this may be visible while calling nextLine() immediately after those methods.

Consider below input values:

```
1001
Savings
```

Referring below code:

```java
Scanner sc = new Scanner(System.in);

int x = sc.nextInt();

String str = sc.nextLine();
```

Here we expect str to have value:

```
Savings
```

Instead it may be:

```
""
```

If above issue is observed, then it is suggested to add one more explicit call to nextLine() after reading numeric value.

---

# Instruction

Kindly mention class name as **MyClass**.

---

# Solution

```java
import java.util.Scanner;

class Laptop {
    private int laptopId;
    private String brand;
    private String osType;
    private double price;
    private int rating;

    public Laptop(int laptopId, String brand, String osType,
                  double price, int rating) {
        this.laptopId = laptopId;
        this.brand = brand;
        this.osType = osType;
        this.price = price;
        this.rating = rating;
    }

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}


public class MyClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Laptop[] laptops = new Laptop[4];

        for (int i = 0; i < 4; i++) {

            int laptopId = sc.nextInt();
            sc.nextLine();

            String brand = sc.nextLine();

            String osType = sc.nextLine();

            double price = sc.nextDouble();

            int rating = sc.nextInt();
            sc.nextLine();

            laptops[i] = new Laptop(
                    laptopId,
                    brand,
                    osType,
                    price,
                    rating
            );
        }

        String searchBrand = sc.nextLine();
        String searchOs = sc.nextLine();


        int count = countOfLaptopsByBrand(laptops, searchBrand);

        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("The given brand is not available");
        }


        Laptop[] result = searchLaptopByOsType(laptops, searchOs);

        if (result != null) {

            for (Laptop laptop : result) {
                System.out.println(laptop.getLaptopId());
                System.out.println(laptop.getRating());
            }

        } else {
            System.out.println("The given os is not available");
        }

        sc.close();
    }


    public static int countOfLaptopsByBrand(
            Laptop[] laptops, String brand) {

        int count = 0;

        for (Laptop laptop : laptops) {

            if (laptop.getBrand().equalsIgnoreCase(brand)
                    && laptop.getRating() > 3) {

                count++;
            }
        }

        return count;
    }


    public static Laptop[] searchLaptopByOsType(
            Laptop[] laptops, String osType) {

        int count = 0;

        for (Laptop laptop : laptops) {

            if (laptop.getOsType().equalsIgnoreCase(osType)) {
                count++;
            }
        }


        if (count == 0) {
            return null;
        }


        Laptop[] result = new Laptop[count];

        int index = 0;

        for (Laptop laptop : laptops) {

            if (laptop.getOsType().equalsIgnoreCase(osType)) {
                result[index++] = laptop;
            }
        }


        // Sort laptopId in descending order

        for (int i = 0; i < result.length - 1; i++) {

            for (int j = i + 1; j < result.length; j++) {

                if (result[i].getLaptopId()
                        < result[j].getLaptopId()) {

                    Laptop temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }

        return result;
    }
}
```