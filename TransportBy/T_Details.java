package TransportBy;
import java.util.Scanner;


public class T_Details {
    private String starting_location;
    private String destination_location;
    private double distance_in_KM;

    // Getters and Setters
    public String getStarting_location() {
        return starting_location;
    }
    public void setStarting_location(String starting_location) {
        this.starting_location = starting_location;
    }
    
    public String getDestination_location() {
        return destination_location;
    }
    public void setDestination_location(String destination_location) {
        this.destination_location = destination_location;
    }

    public double getDistance_in_KM() {
        return distance_in_KM;
    }
    public void setDistance_in_KM(double distance_in_KM) {
        this.distance_in_KM = distance_in_KM;
    }

    
    // Constructor
    public T_Details(String starting_location, String destination_location, double distance_in_KM) {
        this.starting_location = starting_location;
        this.destination_location = destination_location;
        this.distance_in_KM = distance_in_KM;
    }

    public void getT_Dwtails(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Starting Location: " );
        starting_location = sc.nextLine();

        System.out.println("Destination Location: " );
        destination_location = sc.nextLine();
        
        System.out.println("Distance in KM: " );
        distance_in_KM = sc.nextDouble();
    }

    public void displayT_Details(){
        System.out.println("Starting Location: " + starting_location);
        System.out.println("Destination Location: " + destination_location);
        System.out.println("Distance in KM: " + distance_in_KM);
    }
}


