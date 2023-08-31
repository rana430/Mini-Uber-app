package TypesOfRides;

public abstract class Payment {
    private double amount;
    private String currency;
    private String paymentType;

    public Payment(double amount, String currency, String paymentType) {
        this.amount = amount;
        this.currency = currency;
        this.paymentType = PaymentType();
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

   public abstract String PaymentType();
}
