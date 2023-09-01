package CustomerCare;

class InAppChatChannelFactory implements CommunicationChannelFactory {
    @Override
    public CommunicationChannel createChannel() {
        return new InAppChatChannel();
    }
}