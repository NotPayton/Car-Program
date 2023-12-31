import java.util.Scanner;

public class carproject {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

            //default car constructor
        Car defaultCar = new Car();
        System.out.println(defaultCar);
        System.out.println("Carfax of the car: ");
        System.out.println(defaultCar.carfax());


            //Gathers all the input for the car of the user 
        System.out.println();                                           //makes it look nice and neat
        System.out.println("Enter the make of the car: ");
        String make = scan.nextLine();
        System.out.println("Enter the model of the car: ");
        String model = scan.nextLine();
        System.out.println("Enter the year of the car: ");
        int year = scan.nextInt();
        scan.nextLine();                                                //so it doesn't skip the nextLine() method
        System.out.println("Enter the color of the car: ");
        String color = scan.nextLine();
        System.out.println("Enter the VIN number of the car: ");
        String vin = scan.nextLine();
        System.out.println("Enter the top speed of the car: ");
        int topspeed = scan.nextInt();
        scan.nextLine();                                                //so it doesn't skip the nextLine() method
        System.out.println("Enter the fuel type of your car: ");
        String fueltype = scan.nextLine();

            //overloaded car constructor
        Car newCar = new Car(make, model, year, color, vin, topspeed, fueltype);
        System.out.println(newCar);
        System.out.println("Carfax of the car: ");
        System.out.println(newCar.carfax());


            //Gathers all the input for the car of the user 
        System.out.println();                                           //makes it look nice and neat
        System.out.println("Enter the make of your car: ");
        make = scan.nextLine();
        System.out.println("Enter the model of your car: ");
        model = scan.nextLine();
        System.out.println("Enter the year of your car: ");
        year = scan.nextInt();
        scan.nextLine();                                                //so it doesn't skip the nextLine() method
        System.out.println("Enter the color of your car: ");
        color = scan.nextLine();
        System.out.println("Enter the VIN number of your car: ");
        vin = scan.nextLine();
        System.out.println("Enter the top speed of your car: ");
        topspeed = scan.nextInt();
        System.out.println("Enter the fuel economy of your car: ");
        double economy = scan.nextDouble();
        System.out.println("Enter the range of your car: ");
        double range = scan.nextDouble();
        scan.nextLine();                                                //so it doesn't skip the nextLine() method
        System.out.println("Enter the fuel type of your car: ");
        fueltype = scan.nextLine();
        System.out.println("Enter the mileage of your car: ");
        double mileage = scan.nextDouble();
        System.out.println("Enter the fuel capacity of your car: ");
        int fueleco = scan.nextInt();

            //Prints out the new Custom carfax
        Car customCar = new Car(make, model, year, color, vin, topspeed, economy, fueltype, mileage, fueleco); 
        System.out.println(customCar);
        System.out.println("Carfax of the car: ");
        System.out.println(customCar.carfax());

    }
}