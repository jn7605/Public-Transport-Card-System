package Transport;
import java.util.Scanner;


public class T_Details implements Bus, Train{

    public static int travel_id;
    private String starting_location;
    private String destination_location;
    private double distance_in_KM;
    private int type_of_transport; // 1 for Bus, 2 for Train
    
    private String[] store_StartingLocations = new String[100];
    private String[] store_DestinationLocations = new String[100];
    private double[] store_Distances = new double[100];
    public int[] store_travelIDs = new int[100];
    
    
    // Getters and Setters
    public int getType_of_transport() {
        return type_of_transport;
    }
    public void setType_of_transport(int type_of_transport) {
        this.type_of_transport = type_of_transport;
    }

    public String[] getStore_StartingLocations() {
        return store_StartingLocations;
    }
    public void setStore_StartingLocations(String[] store_StartingLocations) {
        this.store_StartingLocations = store_StartingLocations;
    }
    public String[] getStore_DestinationLocations() {
        return store_DestinationLocations;
    }
    public void setStore_DestinationLocations(String[] store_DestinationLocations) {
        this.store_DestinationLocations = store_DestinationLocations;
    }
    public double[] getStore_Distances() {
        return store_Distances;
    }
    public void setStore_Distances(double[] store_Distances) {
        this.store_Distances = store_Distances;
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
        this.travel_id = 0;
    }
    

    //Get the details from user
    public void getT_Details(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Starting Location: " );
        starting_location = sc.nextLine();
        

        System.out.print("Destination Location: " );
        destination_location = sc.nextLine();
        store_DestinationLocations[0] = destination_location;   
        
        System.out.print("Distance in KM: " );
        distance_in_KM = sc.nextDouble();
        store_Distances[0] = distance_in_KM;

        System.out.print("Type of Transport (1 for Bus, 2 for Train): " );
        type_of_transport = sc.nextInt();

    }

    //Display the details that user has entered
    public void displayT_Details(){
        System.out.println("Starting Location: " + starting_location);
        System.out.println("Destination Location: " + destination_location);
        System.out.println("Distance in KM: " + distance_in_KM + " KM");
        if(type_of_transport==1){
            System.out.println("Type of Transport: Bus");
            System.out.println("Total Fare: " + busFinal_fare());
        }
        else if(type_of_transport==2){
            System.out.println("Type of Transport: Train");
            System.out.println("Total Fare: " + trainFinal_fare());
        }
    }

    public void displayTravelHistory(){
        for(int i=0; i<=travel_id; i++){
            System.out.println("Travel ID: " + store_travelIDs[i]);
            System.out.println("From: " + store_StartingLocations[i] + " To: " + store_DestinationLocations[i]);
            System.out.println("Distance: " + store_Distances[i] + " KM");
            System.out.println();
        }
    }

}


