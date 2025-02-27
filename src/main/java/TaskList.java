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
        Task newTask = new Task(newTaskDescription);
        if (head == null) {
            createLinkedList(newTaskDescription);
            return;
        } else if (location == 0) {
            newTask.setNext(head);
            head = newTask;
        } else if (location >= size) {
            tail.setNext(newTask);
            newTask.setNext(null);
            tail = newTask;
        } else {
            Task tempTask = head;
            int index = 0;
            while (index < location - 1) {
                tempTask = tempTask.getNext();
                index++;
            }
            Task nextTask = tempTask;
            tempTask.setNext(nextTask);
        }
        size++;
    }
    public void markTaskComplete(int taskLocation){
        Task targetTask = searchAndReturnTaskByLocation(taskLocation);
        targetTask.markTaskComplete();
    }

    public Task searchAndReturnTaskByLocation(int location){
        if (this.head != null){
            Task tempTask = this.head;
            for (int i =0; i<this.size; i++){
                if (i == location){
                    System.out.println("Found the Task: " + tempTask.getTaskDescription() + " at location: " + i + "\n");
                    return tempTask.getTask();
                }
                tempTask = tempTask.getNext();
            }
        }
        System.out.println("Task not found");
        return null;
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
