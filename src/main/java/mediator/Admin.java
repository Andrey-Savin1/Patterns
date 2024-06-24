package mediator;

public class Admin implements User{

    Chat chat;
    String name;

    public Admin(Chat chat, String name) {
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
        System.out.println(this.name + "отправл€ю сообщение " + s);
    }
}
