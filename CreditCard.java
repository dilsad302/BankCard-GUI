package Wek19.GUI.Coursework;


/**
 * Write a description of class CreditCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class CreditCard extends BankCard
{
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    //constructor is being created for creditcard attributes
    public CreditCard(String clientName,int balanceAmount,int cardId ,String bankAccount, String issuerBank, int cvcNumber, double interestRate, String expirationDate){
        super(clientName,balanceAmount, cardId,bankAccount, issuerBank);
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.creditLimit=  creditLimit;
        this.gracePeriod=  gracePeriod;
        isGranted = false;
    }

    /* Accessor Method of each correspondings*/
    public int getcvcNumber(){
        return this.cvcNumber;
    }

    public void setcvcNumber(int newcvcNumber){
        cvcNumber = newcvcNumber;
    }

    public double getinterestRate(){
        return this.interestRate;
    }

    public void setinterestRate(double newinterestRate){
        interestRate = newinterestRate;
    }

    public double getcreditLimit(){
        return this.creditLimit;
    }

    public void setcreditLimit( double newcreditLimit){
        creditLimit = newcreditLimit;
    }

    public String getexpirationDate(){
        return this.expirationDate;
    }

    public void setexpirationDate(String newexpirationDate){
        expirationDate = newexpirationDate;
    }

    public int getgracePeriod(){
        return this.gracePeriod;
    }

    public void setgracePeriod(int newgracePeriod){
        gracePeriod = newgracePeriod;
    }

    public boolean getisGranted(){
        return this.isGranted;
    }

    public void setisGranted(boolean newisGranted){
        isGranted = newisGranted;

    }

    public void creditLimit(int creditLimit, int gracePeriod){
        
        if( creditLimit <= 2.5 * super.getbalanceAmount() ){
            this.isGranted = true;
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
        }
         //following error occurs when credit cannot be issued.
        else{
            System.out.println("Credit Card cannot be generated");
        }
    }
    //creating a method to cancelCredit
    public void cancelCredit(){
        //following if condition implifies if the customer has succesfully paid the amount of credit taken
        if( isGranted == true    ){
            this.gracePeriod = 0;
            this.creditLimit = 0;
            isGranted = false;
            System.out.println("Succesfully credit has been paid!!");
        }
       
        else{
            System.out.println("Credit card has been cancelled succsefully!!");

        }
    }
 
    public void display(){
        //incase of customer takes credit following display method shows the following output.
        if(isGranted == true){
            System.out.println("Display the credit card details");
            super.display();
            System.out.println("Grace Period: " + gracePeriod);
            System.out.println("Credit Limit: " + creditLimit);
        }
        //incase of no credit taken of the details of the customer are displayed.
        if( isGranted == false){
            super.display();
        }
    }
}


