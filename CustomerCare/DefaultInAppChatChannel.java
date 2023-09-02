package CustomerCare;

class DefaultInAppChatChannel implements InAppChatChannel {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending in-app chat message: " + message);
    }
}
