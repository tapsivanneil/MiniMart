import java.util.*;

public class Card {

    Scanner sc = new Scanner(System.in);

    private String cardName;
    private double cardBalance;
    private int idNum;
    private boolean masterCardStat;
    //private int masterCardPass = 12345;

    public void setCardName(String cardName){
        this.cardName = cardName;
    }

    public void setCardBalance(double cardBalance){
        this.cardBalance = cardBalance;
    }

    public void addCardBalance(){
        System.out.print("\nEnter the amount: ");
        double addBalance = sc.nextDouble();
        this.cardBalance = cardBalance + addBalance;
    }

    public void setIdNum (int idNum){
        this.idNum = idNum;
    }

    public void setMasterCardStat (boolean masterCardStat){
        this.masterCardStat = masterCardStat;
    }

    public String getCardName(){
        return cardName;
    }


    public double getCardBalance(){
        return cardBalance;
    }

    public int getIdNum(){
        return idNum;
    }

    public boolean getMasterCardStat(){
        return masterCardStat;
    }

    public void showCardInfo (){
        System.out.println("\nName: " + cardName);
        System.out.println("ID Number: " + idNum);
        System.out.println("Balance: " + cardBalance + "\n");
    }

}

