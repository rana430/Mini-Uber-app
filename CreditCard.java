package TypesOfRides;

import java.util.Date;

public class CreditCard extends Payment{

    private long CardNumber;
    private int CVV;
    private Date ExpDate;

    public CreditCard(double amount, String currency, String PaymentType, long CardNumber, int CVV,Date ExpDate) {
        super(amount, currency, PaymentType);
        this.CardNumber = CardNumber;
        this.CVV        = CVV;
        this.ExpDate    = ExpDate;
    }


    public String PaymentType(){
        return "Credit Card";
    }

}
