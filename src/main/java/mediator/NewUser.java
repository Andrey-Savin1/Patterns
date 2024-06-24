package mediator;

public class NewUser implements User{

    Chat chat;
    String name;

    public NewUser(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String s) {
        chat.sendMessage(s, this);
    }

    @Override
    public void getMessage(String s) {
        System.out.println(this.name + "получил сообщение: " + s);
    }
}
