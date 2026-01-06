package Transport;
import java.util.Scanner;


public class T_Details implements Bus, Train{
    private String starting_location;
    private String destination_location;
    private double distance_in_KM;
    private int type_of_transport; // 1 for Bus, 2 for Train


    
    // Getters and Setters
    public int getType_of_transport() {
        return type_of_transport;
    }
    public void setType_of_transport(int type_of_transport) {
        this.type_of_transport = type_of_transport;
    }

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


    //Calculate final fare based on type of transport & distance
    public double trainFinal_fare() {
        return distance_in_KM * Train.fare_per_1KM;
    }

    public double busFinal_fare() {
        return distance_in_KM * Bus.fare_per_1KM;
    }

    
    // Constructor
    public T_Details() {
        this.starting_location = "";
        this.destination_location = "";
        this.distance_in_KM = 0.0;
        this.type_of_transport = 0;
    }
    

    //Get the details from user
    public void getT_Details(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Starting Location: " );
        starting_location = sc.nextLine();

        System.out.println("Destination Location: " );
        destination_location = sc.nextLine();
        
        System.out.println("Distance in KM: " );
        distance_in_KM = sc.nextDouble();

        System.out.println("Type of Transport (1 for Bus, 2 for Train): " );
        type_of_transport = sc.nextInt();

    }

    //Display the details that user has entered
    public void displayT_Details(){
        System.out.println("Starting Location: " + starting_location);
        System.out.println("Destination Location: " + destination_location);
        System.out.println("Distance in KM: " + distance_in_KM);
        if(type_of_transport==1){
            System.out.println("Type of Transport: Bus");
            System.out.println("Fare per KM: " + busFinal_fare());
        }
        else if(type_of_transport==2){
            System.out.println("Type of Transport: Train");
            System.out.println("Fare per KM: " + trainFinal_fare());
        }
    }


}


