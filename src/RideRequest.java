public class RideRequest {
    private String pickupLocation;
    private String destination;
    private String passengerName;

    public static int requestCounter = 0;
    public RideRequest(String pickupLocation, String destination, String passengerName) {
        this.pickupLocation = pickupLocation;
        this.destination = destination;
        this.passengerName = passengerName;
        requestCounter++;
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
