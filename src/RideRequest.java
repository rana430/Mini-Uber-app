public class RideRequest {
    private int pickupLocation;
    private int destination;
    private String passengerName;

    public static int requestCounter = 0;
    public RideRequest(int pickupLocation, int destination, String passengerName) {
        this.pickupLocation = pickupLocation;
        this.destination = destination;
        this.passengerName = passengerName;
        requestCounter++;
        CalcDistance calculate=new CalcDistance(pickupLocation,destination);
    }

    public int getPickupLocation() {
        return pickupLocation;
    }

    public int getDestination() {
        return destination;
    }

    public String getPassengerName() {
        return passengerName;
    }
}
