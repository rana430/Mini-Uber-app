public class Payment {

   private PaymentStrategy p ;
   public Payment(PaymentStrategy p)
   {
       this.p = p;
   }
   public void performPayment(int amount,String currency)
   {
       p.processPayment(amount, currency);
   }
}
