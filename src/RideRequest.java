package TypesOfRides.src;

public class RideRequest {
    private String pickupLocation;
    private String destination;
    private String passengerName;

    public RideRequest(String pickupLocation, String destination, String passengerName) {
        this.pickupLocation = pickupLocation;
        this.destination = destination;
        this.passengerName = passengerName;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public String getDestination() {
        return destination;
    }

    public String getPassengerName() {
        return passengerName;
    }
}
