package CustomerCare;

class PhoneChannelFactory implements CommunicationChannelFactory {
    @Override
    public CommunicationChannel createChannel() {
        return new PhoneChannel();
    }
}
