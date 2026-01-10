import java.util.Scanner;

import Transport.T_Details;

public class card {

    protected int ID;
    private double balance;
    private String owner_name;
    private String owner_contact;
    private int switchTransportMode;

    public card() {
        this.ID = 1;
        this.balance = 2000;
        this.owner_name = "";
        this.owner_contact = "";
        switchTransportMode = 0;
    }

    T_Details[] passenger__1 = new T_Details[100];

    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getOwner_name() {
        return owner_name;
    }
    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }
    public String getOwner_contact() {
        return owner_contact;
    }
    public void setOwner_contact(String owner_contact) {
        this.owner_contact = owner_contact;
    }

    public void setPassenger(T_Details passenger){
        this.passenger__1[0] = passenger;
    }

    public void checkBalance() {

        do {

            if(this.getBalance()>passenger__1[0].trainFinal_fare() && passenger__1[0].getType_of_transport() == 2){
                System.out.println("You can transport by train.");
                System.out.println("Your current balance is "+ this.balance);
                calculateAfter_balance();
                loadTo_TravelHistory();
                break;
            }if(this.getBalance()>passenger__1[0].busFinal_fare() && passenger__1[0].getType_of_transport()==1){
                System.out.println("You can transport by bus.");
                System.out.println("Your current balance is "+ this.balance);
                calculateAfter_balance();
                loadTo_TravelHistory();

                break;
            }if(this.getBalance()<passenger__1[0].busFinal_fare() && this.getBalance()>passenger__1[0].trainFinal_fare() && passenger__1[0].getType_of_transport()==1){
                System.out.println("Your balance is not enough to go by bus, You can go by train. If you want to go by train press 1 and if you want exit press 0.");
                System.out.println("Your current balance is "+ this.balance);
                Scanner sc = new Scanner(System.in);
                switchTransportMode = sc.nextInt();
            }
            if(this.getBalance()<passenger__1[0].trainFinal_fare()){
                System.out.println("Your balance is not enough to go by bus or train. Please recharge your card.");
                System.out.println("Your current balance is "+ this.balance);
                System.out.println("If you want recharge your card, please enter R:");
                Scanner sc = new Scanner(System.in);
                String rechargeOption = sc.nextLine();
                if(rechargeOption.equalsIgnoreCase("R")){
                    System.out.print("Please enter the amount to recharge: ");
                    double amount = sc.nextDouble();
                    rechargeCard(amount);
                    break;
                }

            }
        }while(switchTransportMode==1);

        System.out.println("---------------------------------------------");

    }
    
    //this is called inside checkBalance() method
    public void calculateAfter_balance(){
        if(passenger__1[0].getType_of_transport() == 1){
            
            this.balance = this.balance - passenger__1[0].busFinal_fare();
            System.out.println("Your fare is " + passenger__1[0].busFinal_fare() + " and it is deducted.");
            System.out.println("Your balance after the journey is "+ this.balance);
            
        }else if(passenger__1[0].getType_of_transport() == 2){
            
            this.balance = this.balance - passenger__1[0].trainFinal_fare();
            System.out.println("Your fare is " + passenger__1[0].trainFinal_fare() + " and it is deducted.");
            System.out.println("Your balance after the journey is "+ this.balance);
            
        }
        ++(T_Details.travel_id);
        passenger__1[0].store_travelIDs[0] = T_Details.travel_id;

    }

    public void rechargeCard(double amount){
        System.out.println("Your card is recharged by "+ amount);
        this.balance = this.balance + amount;
        System.out.println("Your current balance is "+ this.balance);
    }

    //this is called inside checkBalance() method
    public void loadTo_TravelHistory(){
        passenger__1[0].setStore_StartingLocations(passenger__1[0].getStore_StartingLocations());
        passenger__1[0].setStore_DestinationLocations(passenger__1[0].getStore_DestinationLocations());
        passenger__1[0].setStore_Distances(passenger__1[0].getStore_Distances());
    }

    
}

