import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");
        User[] usersArray = {user1,user2,user3};
        user1.addTask("Do dishes",0);
        user1.addTask("Take Trash Out",0);
        user1.addTask("Complete assignment",0);
        user2.addTask("Attend meeting",0);
        user2.addTask("Grocery shopping",0);
        user2.addTask("Cook",0);
        user3.addTask("Clean",0);
        user3.addTask("Organize",0);
        user3.addTask("Rearrange",0);
        user1.markTasKComplete(1);
        user2.markTasKComplete(0);
        user3.markTasKComplete(2);
        user1.printAllTasks();
        user2.printAllTasks();
        user3.printAllTasks();

    }
}
