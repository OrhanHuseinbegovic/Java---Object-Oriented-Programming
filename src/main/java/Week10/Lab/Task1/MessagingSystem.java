package Week10.Lab.Task1;

public class MessagingSystem {

    // Method to send messages with appropriate access control
    @CanSendMessage
    @RequiresPermission("USER")
    public static void sendMessage(User user, String message) {
        System.out.println("User " + user.username + " sent a message: " + message);
    }

    @CanSendMessage
    @RequiresPermission("ADMIN")
    public static void sendMessage(Admin admin, String message) {
        System.out.println("Admin " + admin.username + " sent a message: " + message);
    }

    public static void main(String[] args) {
        // Demonstrate usage of sendMessage method with different users and admins

        User regularUser = new User("John");
        Admin adminUser = new Admin("Admin1");

        // Attempt to send a message with regular user (should be restricted)
        sendMessage(regularUser, "Hello from regular user");

        // Attempt to send a message with admin (should be allowed)
        sendMessage(adminUser, "Important message from admin");

    }
}
