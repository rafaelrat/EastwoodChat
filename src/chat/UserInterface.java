package chat;

public interface UserInterface {
    void addMessage(String nickname, String message);

    void addSystemMessage(String message);
    void addErrorMessage(String message);

    void clearChat();

}
