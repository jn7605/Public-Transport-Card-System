

import Transport.*;

public class Journey {
    
    T_Details[] passenger1 = new T_Details[100];
    card[] card1 = new card[100];
    

    // Create objects when Journey class is called by default
    public Journey() {
        passenger1[0] = new T_Details();
        passenger1[0].getT_Details();
        passenger1[0].displayT_Details();
    }
    

    public void checkBalance() {
        if(card1[0].getBalance()>passenger1[0].trainFinal_fare() && passenger1[0].getType_of_transport() == 2){
            System.out.println("You can transport by train.");
        }if(card1[0].getBalance()>passenger1[0].busFinal_fare() && passenger1[0].getType_of_transport()==1){
            System.out.println("You can transport by bus.");
        }if(card1[0].getBalance()<passenger1[0].busFinal_fare() && card1[0].getBalance()>passenger1[0].trainFinal_fare() && passenger1[0].getType_of_transport()==1){
            System.out.println("Your balance is not enough to go by bus, You can go by train. If you want to go by train press 1 and if you want exit press 0.");
        }
    
    }
}
