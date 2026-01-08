
import Transport.*;
import java.util.Scanner;

// Journey class to manage the journey details and fare calculations
public class Journey {

    
    public void startJourney() {
        T_Details[] passenger__2 = new T_Details[100];
        card[] card__1 = new card[100];
        //should be added a for loop here to create multiple objects
        for(int i=0; i<100; i++){
            for(int j=0; j<3; j++){
                passenger__2[i] = new T_Details();
                passenger__2[i].intro();
                passenger__2[i].getT_Details();
                passenger__2[i].displayT_Details();
                card__1[i].checkBalance();
                i++;
            }
            passenger__2[i].ifAdmin();
        }

    }


}
