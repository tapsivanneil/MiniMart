public class Card {
    private String cardName;
    private double cardBalance;
    private int idNum;

    public void setCardName(String cardName){
        this.cardName = cardName;
    }

    public void setCardBalance(double cardBalance){
        this.cardBalance = cardBalance;
    }

    public void setIdNum (int idNum){
        this.idNum = idNum;
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


}

