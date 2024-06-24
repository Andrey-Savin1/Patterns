package mediator;

public class ChatRunner {
    public static void main(String[] args) {

        NewChat chat = new NewChat();

        User admin = new Admin(chat, "admin ");
        User user1 = new Admin(chat, "user 1 ");
        User user2 = new Admin(chat, "user 2 ");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("я первый юзер ");
        admin.sendMessage("я админ ");

    }
}
