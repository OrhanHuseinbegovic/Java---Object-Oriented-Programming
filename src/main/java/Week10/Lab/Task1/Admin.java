package Week10.Lab.Task1;



@UserPermission("ADMIN")
public class Admin implements Message{
    String username;

    public Admin(String username) {
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
        System.out.println("Message is sent by ADMIN");
    }
}
