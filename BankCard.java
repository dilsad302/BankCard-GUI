package Wek19.GUI.Coursework;


/**
 * Write a description of class BankCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankCard
{
    // bank card has following five attributes which are respectively listed below
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private int balanceAmount;       
     //constructor
    public BankCard( String clientName,int balanceAmount,int cardId ,String bankAccount, String issuerBank)
    { 
        this.clientName = clientName; //initialised with empty string
        this.cardId = cardId;
        this.bankAccount = bankAccount;
        this.balanceAmount = balanceAmount;
        this.issuerBank = issuerBank;

    }

    // Accessor Method of each correspondings
    public String getclientName()
    {
        return this.clientName;
    }

    public int getbalanceAmount()
    {
        return this.balanceAmount;
    }

    public int getcardId()
    {
        return this.cardId;
    }

    public String getbankAccount()
    {
        return this.bankAccount;
    }

    public String getissuerBank()
    {
        return this.issuerBank;
    }

    //Setter Method to set the new client name
    public void setclientName(String newclientName)
    {
        clientName = newclientName; 
    }

    public void setcardId(int newcardId){
        cardId= newcardId;

    }

    //Setter Method to set the new balance amount
    public void setbalanceAmount(int newbalanceAmount)
    {
        balanceAmount = newbalanceAmount;
    } 

    public void setbankAccount(String newbankAccount){
        bankAccount = newbankAccount;
    }

    public void setissuerBank(String newissuerBank){
        issuerBank = newissuerBank;
    }
    //following method is used to display the details of the customer regsitered inside the bank system.
    public void display(){
        // following validation is done to check whether the client name is initilised empty or client name is set
        if(clientName  == ""){
            System.out.println("Field Client name is empty!!!"  );
        }
        //following condition runs if the client name is set otherwise empty field error occurs.
        else{
            System.out.println("Client Name: " + clientName );
        }
            System.out.println("Displaying the account holder details: " );
            System.out.println("Card Id: " + cardId );
            System.out.println("Total balance amount: " + balanceAmount );
            System.out.println("Bank Account number: " + bankAccount);
            System.out.println("Issued from " + issuerBank);

    }
}
