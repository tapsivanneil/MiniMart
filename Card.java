public class Card {
    private String cardName;
    private double cardBalance;
    private int idNum;
    private boolean masterCardStat;
    private int masterCardPass = 12345;

    public void setCardName(String cardName){
        this.cardName = cardName;
    }

    public void setCardBalance(double cardBalance){
        this.cardBalance = cardBalance;
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

    public int getMasterCardPass(){
        return masterCardPass;
    }


}

