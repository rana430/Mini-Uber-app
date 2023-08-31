package CustomerCare;

class EmailChannelFactory implements CommunicationChannelFactory {
    @Override
    public CommunicationChannel createChannel() {
        return new EmailChannel();
    }
}
