package TypesOfRides.src;

public class PremiumDescription implements Description{
    public void description(double price)
    {
        System.out.println(" Take 4 passenger |Comfortable | Fast | With air conditioner");
        System.out.println(price+(price*0.2));
    }
}
