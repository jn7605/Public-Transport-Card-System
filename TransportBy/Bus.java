package TransportBy;

public class Bus extends T_Details {
    private final double Bus_fare_per_1KM=90.00;
    private double final_fare;

    // Constructor
    public Bus(){
        this.final_fare = 0.0;
    }    
    public double getFinal_fare() {
        final_fare = getDistance_in_KM() * Bus_fare_per_1KM;
        return final_fare;
    }
    
}
