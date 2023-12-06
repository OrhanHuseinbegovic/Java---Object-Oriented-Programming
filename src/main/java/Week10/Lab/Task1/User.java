package Week10.Lab.Task1;

@UserPermission
public class User implements Message{
    String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    @CanSendMessage
    public void sendMessage(){
        System.out.println("Message is sent by USER");
    }

}
