package TypesOfRides;

public class Payment {
    private double amount;
    private String currency;
    private String paymentType;

    public Payment(double amount, String currency, String paymentType) {
        this.amount = amount;
        this.currency = currency;
        this.paymentType = paymentType;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getPaymentType() {
        return paymentType;
    }
}
