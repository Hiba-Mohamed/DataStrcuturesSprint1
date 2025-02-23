public class Task {
    private String taskDescription;
    private boolean complete;

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
}
