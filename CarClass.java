import java.util.Random;
public class Car
{
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

    String Make[] = {"Kia, Nissan, Ford, Toyota, Honda"};
    String Model[] = {""};
    String Color[] = {"Silver, Blue, White, Black"};
    String FuelType[] = {"Gas, Electric, Hybrid"};
    String Vin[] = {"A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9"};

    public String GetVin() {
        String VinBlank = ("");
        for (int i = 0; i < 17; i++);
            char

    }




    public Car(String make, String model, int year, String color, String fueltype, double fueleco, double range, String VIN, int topspeed, double mileage)
    {
        rand = new Random();
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.VIN = VIN;
        this.topspeed = topspeed;
        this.fueleco = fueleco;
        this.range = range;
        this.fueltype = fueltype;
        this.mileage = mileage;
    }

}
