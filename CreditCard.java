public class CreditCard implements PaymentStrategy{

    String CardNumber;
    String cvv;
    String expDate;

    public CreditCard(String cardNumber, String cvv, String expDate) {
        CardNumber = cardNumber;
        this.cvv = cvv;
        this.expDate = expDate;
    }

    @Override
    public String processPayment(int amount, String currency) {
        return "pay with credit card " + amount + " in " + currency;
    }
}
