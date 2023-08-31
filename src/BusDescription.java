package TypesOfRides.src;

public class BusDescription implements Description{
    @Override
    public void description(double price) {
        System.out.println("30 passenger | With air conditioner | Medium speed");
        System.out.println(price+(0.3*price));
    }
}
