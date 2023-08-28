package TypesOfRides;

public class NormalDescprition implements  Description{
    public void description(double price){
        System.out.println("Take 4 passenger | Low fares | without air  conditioner");
        System.out.println(price+(price*0.1));
    }
}
