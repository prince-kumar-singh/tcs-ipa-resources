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

        // Count matching laptops

        for (Laptop laptop : laptops) {

            if (laptop.getOsType().equalsIgnoreCase(osType)) {
                count++;
            }
        }


        if (count == 0) {
            return null;
        }


        // Create result array

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