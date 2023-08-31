package TypesOfRides;

import java.util.Date;

public class Cash extends Payment{

    public Cash(double amount, String currency,String PaymentType) {
        super(amount, currency, PaymentType);
    }

    @Override
    public String PaymentType() {
        return "Cash";
    }


}
