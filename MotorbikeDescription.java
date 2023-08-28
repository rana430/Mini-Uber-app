package TypesOfRides;

public class MotorbikeDescription implements Description{
    @Override
    public void description(double price) {
        System.out.println("1 Passenger | Faster | Cheaper");
        System.out.println(price);
    }
}
