public class Task {
    private String taskDescription;
    private boolean complete;

    public Task(String newTaskDescription, Boolean newComplete){
        this.taskDescription = newTaskDescription;
        this.complete = newComplete;
    }
    public void setTaskDescription(String newDescription){
        this.taskDescription = newDescription;
    }

    public void setComplete(boolean newComplete) {
        this.complete = newComplete;
    }

    public String getTaskDescription(){
        return this.taskDescription;
    }

    public boolean getCompletionStatus(){
        return this.complete;
    }
    public void markTaskComplete (){
        this.complete = true;
    }

    public void markTaskIncomplete(){
        this.complete = false;
    }
}
