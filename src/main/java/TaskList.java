public class TaskList {
    private Task head;
    private Task tail;
    private int size;

    public Task createLinkedList(String taskDescription){
        Task newhead = new Task(taskDescription);
        newhead.setNext(null);
        this.head = newhead;
        this.tail = newhead;
        this.size = 1;
        return head;
    }

    public void addTask(String newTaskDescription, int location){
        if(this.size == 1){
            Task newTask = new Task(newTaskDescription);
            head.setNext(newTask);
            newTask.setNext(null);
        }
        //if at the end
        this.size = this.size +1;



    }
    public void markTaskComplete(int taskLocation){


    }
    public void printAllTasks(){
        if (head == null) {
            System.out.println("SLL does not exist");
        } else {
            Task tempTask = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempTask.getTaskDescription() + "  "+ tempTask.getCompletionStatusString());
                if (i != size -1 ){
                    System.out.print(" -> ");
                }
                tempTask = tempTask.getNext();
            }
            System.out.print("\n");
        }

    }
}
