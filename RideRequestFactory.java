public class RideRequestFactory {
    public RideRequest createRideRequest(User user, Location pickupLocation, Location dropoffLocation) {
        // Create a new RideRequest object
        RideRequest rideRequest = new RideRequest(user, pickupLocation, dropoffLocation);

        // Perform any necessary operations, such as validating input, applying business rules, etc.
        validateRideRequest(rideRequest);

        // Return the created RideRequest object
        return rideRequest;
    }
}
