import Transport.T_Details;

public class card {

    protected int ID;
    private double balance;
    private String owner_name;
    private String owner_contact;
    public card(int iD, double balance, String owner_name, String owner_contact) {
        ID = 1;
        this.balance = 2000;
        this.owner_name = "Anuja Wanigasekara";
        this.owner_contact = "0776253447";
    }
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

    



    
    
    
}
