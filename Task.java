class Task{
    /*
     * Author: Ahmad Ahmadzai
     * Version: 1.0.0
     */

        /*
     * The Task class is designed to store information on the description of the task and whether it is declared to be complete or not.
     * 
     * As such, we have the 2 fields, description and taskComplete that store a String and a boolean value respectively.
     * 
     * There is also a constructor method that initialises the Task object with a description and task state.
     * 
     * The information within the task object can be obtained through accessor methods and modified through mutator methods.
    */
    
    private String description;
    private boolean taskComplete;

    // Initialises the Task object with a provided description whilst defaulting the taskComplete field to false.
    Task(String description){
        this.description = description;
        this.taskComplete = false;
    }

    // Accessor methods below.

    // Gets the description for the task object.
    public String getDescription(){
        return description;
    }

    // Gets the state of the task as to if it is complete or not.
    public boolean isTaskComplete(){
        return taskComplete;
    }

    // END of Accessor methods.

    // Mutatator methods below.

    // Modifies the description of the task by passing a new description.
    public void modifyDescription(String newDescription){
        if(newDescription.equals("")){
            System.out.println("You have entered an empty description. Please write a description for your task.");
        }
        else{
            description = newDescription;
        }
        return;
    }

    // Modifies the state of the task by passing a boolean value.
    public void modifyTaskState(boolean complete){
        taskComplete = complete;
        return;
    }
}