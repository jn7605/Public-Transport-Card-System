
import Transport.*;
import java.util.Scanner;

// Journey class to manage the journey details and fare calculations
public class Journey {

    
    T_Details[] passenger__2 = new T_Details[100];
    card[] card__1 = new card[100];

    

    // Create objects when Journey class is called by default
    public Journey() {


        //should be added a for loop here to create multiple objects
        passenger__2[0] = new T_Details();
        passenger__2[0].getT_Details();
        passenger__2[0].displayT_Details();

    }


}
