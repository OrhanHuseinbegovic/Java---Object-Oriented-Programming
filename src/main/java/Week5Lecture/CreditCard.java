package Week5Lecture;

import java.util.Date;


class Main{
    public static void main (String[] args){
        CreditCard becirsCard =
                new CreditCard("123",new Date(System.currentTimeMillis()),"999",CardType.CREDIT, CardBrand.MASTER_CARD, 100);
    }
}
class CreditCard {
    private String cardNo;
    private Date expiresAt;
    private String cvc;
    private CardType cardType;
    private CardBrand cardBrand;

    private double balance;


    public CreditCard(String cardNo, Date expiresAt, String cvc, CardType cardType, CardBrand cardBrand, double balance) {
        this.cardNo = cardNo;
        this.expiresAt = expiresAt;
        this.cvc = cvc;
        this.cardType = cardType;
        this.cardBrand = cardBrand;
        this.balance = balance;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Date getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    public String getCvc() {
        return cvc;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public CardBrand getCardBrand() {
        return cardBrand;
    }

    public void setCardBrand(CardBrand cardBrand) {
        this.cardBrand = cardBrand;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) throws Exception {
        if (this.balance<=0){
            throw new Exception("You can only deposite positive amount of money!"); //throwing error to hte user so he knows what happened
        }
        this.balance = balance;
    }
}
enum CardType{
    CREDIT, DEBIT
}
enum CardBrand{
    MASTER_CARD, VISA
}
