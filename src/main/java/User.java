public class User {
    private String userName;
    private TaskList userTaskList;

    public User (String newUserName, TaskList newUserTaskList){
        this.userName = newUserName;
        this.userTaskList = newUserTaskList;
    }
    public User (String newUserName){
        this.userName = newUserName;
        this.userTaskList = new TaskList();
    }

    public void setUserName (String name){
        this.userName = name;
    }

    public void  setUserTaskList (TaskList list){
        this.userTaskList = list;
    }

    public String getUserName() {
        return userName;
    }

    public TaskList getUserTaskList() {
        return userTaskList;
    }

    public void addTask(String newTaskDescription, int location){
        this.userTaskList.addTask(newTaskDescription, location);
    }

    public void markTasKComplete(int taskLocation){
       userTaskList.markTaskComplete(taskLocation);
    }

    public void printAllTasks(){
        this.userTaskList.printAllTasks();
    }
}
