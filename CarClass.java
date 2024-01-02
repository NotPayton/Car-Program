import java.util.Random;
public class Car {
    //Iniatlizes all variables 
    private String make;
    private String model;
    private int year;
    private String color;
    private String fueltype;
    private double fueleco;
    private double range;
    private String VIN;
    private int topspeed;
    private double mileage;
    private Random rand;


    //Gives make model color fueltype and VinNum string text values 
    String Make[] = {"Kia, Nissan, Ford, Toyota, Honda"};
    String Model[] = {"Stinger, Skyline, F150, Supra, Civic"};
    String Color[] = {"Silver, Blue, White, Black"};
    String FuelType[] = {"Gas, Electric, Hybrid"};
    String VinNum = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";


    //Creates a for loop that steps through the VinNum and takes 17 random characters and then returns it to a blank statement
    public String GetVin() {
        String VinBlank = ("");
        for (int i = 0; i < 17; i++) {
            char letter = VinNum.charAt(rand.nextInt(35));
            VinBlank += letter;
        }
        return VinBlank;
    }

    //Overload Constructor that makes a comepltely brand new random car
    public Car() {
        rand = new Random();
        int num = rand.nextInt(Make.length);
        this.make = Make[num];
        this.model = Model[num];
        this.year = rand.nextInt(1995, 2024);
        this.color = Color[rand.nextInt(Color.length)];
        this.VIN = GetVin();
        this.topspeed = topspeed;
        this.fueleco = fueleco;
        this.range = range;
        this.fueltype = fueltype;
        this.mileage = mileage;
    }
    
    //Default Constructor where you made everthing up about the car
    public Car(String make, String model, int year, String color, String fueltype, double fueleco, double range, String VIN, int topspeed, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.fueltype = fueltype;
        this.fueleco = fueleco;
        this.range = range;
        this.VIN = VIN;
        this.topspeed = topspeed;
        this.mileage = mileage;
    }

    //returns a random year make and model to the car
    public String toString() {
        return this.year + "" + this.make + "" + this.model;
    }

}
