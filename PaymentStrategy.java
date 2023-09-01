public interface PaymentStrategy {

    String processPayment(int amount,String currency);
}
