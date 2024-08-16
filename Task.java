import java.time.LocalDate;

public class Task {
    //Instance Variables
    private String title;
    private String description;
    Boolean isCompleted;
    LocalDate deadline;
    int priority;

    //Constructor
    public Task(String title,String description , LocalDate deadline , int priority){
        this.title = title;
        this.description = description;
        this.isCompleted = false;
        this.deadline = deadline;
        this.priority = priority;
    }

    //Getters
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public int getPriority() {
        return priority;
    }

    //Setters
    public void setTitle(String title){
        this.title = title;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setCompleted(boolean isCompleted){
        this.isCompleted = isCompleted;
    }

    public void setDeadline(LocalDate deadline){
        this.deadline = deadline;
    }

    public void setPriority(int priority){
        this.priority = priority;
    }



}
