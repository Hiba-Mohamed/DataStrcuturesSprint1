public class TaskList {
    private Task head;
    private Task tail;
    private int size;

    public Task createLinkedList(String taskDescription){
        Task newhead = new Task(taskDescription);
        newhead.setNext(null);
        this.head = newhead;
        this.size = 1;
        return head;
    }

    public void addTask(Task newTask){}
    public void markTaskComplete(String description){

    }
    public void printAllTasks(){

    }
}
