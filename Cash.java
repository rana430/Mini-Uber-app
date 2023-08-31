public class Cash implements PaymentStrategy{

    @Override
    public String processPayment(int amount, String currency) {
        return "pay with Cash " + amount + "in " + currency;
    }
}
