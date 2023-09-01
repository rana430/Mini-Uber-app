public class RideRequestHandlerImpl implements RideRequestHandler {
    private static RideRequestHandlerImpl instance;

    private RideRequestHandlerImpl() {}

    public static RideRequestHandlerImpl getInstance() {
        if (instance == null) {
            synchronized (RideRequestHandlerImpl.class) {
                if (instance == null) {
                    instance = new RideRequestHandlerImpl();
                }
            }
        }
        return instance;
    }

    public void handleRideRequest(RideRequest rideRequest) {

    }
}
