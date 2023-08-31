package CustomerCare;

class PhoneChannel implements CommunicationChannel {
    @Override
    public void sendMessage(String message) {
        System.out.println("Making phone call: " + message);
    }
}