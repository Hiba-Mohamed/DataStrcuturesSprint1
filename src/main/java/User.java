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

    public void addTask(Task newTask){
        this.userTaskList.addTask(newTask);
    }

    public void markTasKComplete(String description){
       userTaskList.markTaskComplete(description);
    }

    public void printAllTasks(){
        this.userTaskList.printAllTasks();
    }
}
