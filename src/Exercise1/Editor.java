package src.Exercise1;

import java.util.ArrayList;

public class Editor {
    private ArrayList<Task> tasks = new ArrayList<Task>();
    private Integer activeTask = 0;
    private CommandHistory history = new CommandHistory();

    public void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    public void undo() {
        if (history.isEmpty()) return;

        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public Integer getActiveTask() {
        return activeTask;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public void setActiveTask(Integer activeTask) {
        this.activeTask = activeTask;
    }

    public void printTasks(){
        System.out.println("    Index Name                Description         Created At                    Is Completed?");
        int i = 0;
        for(Task task: this.tasks){
            if ( i == this.activeTask){
                System.out.print("--> "+(i+"       ").substring(0,6));
            }else{
                System.out.print("    "+(i+"       ").substring(0,6));
            }
            System.out.print((task.getName()+"                    ").substring(0,20));
            System.out.print((task.getDescription()+"                    ").substring(0,20));
            System.out.print((task.getCreatedAt()+"                              ").substring(0,30));
            System.out.println((task.getCompleted()+"          ").substring(0,10));
            i++;
        }
        System.out.println();
    }
}
