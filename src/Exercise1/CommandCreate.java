package src.Exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class CommandCreate extends Command{

    CommandCreate(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        backup();
        ArrayList<Task> tasks = new ArrayList<>();
        for(Task task : editor.getTasks()){
            tasks.add(task.copy());
        }
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter name of task :  ");
        String taskName = myObj.nextLine();
        System.out.print("Enter description of task :  ");
        String taskDescription = myObj.nextLine();
        tasks.add(new Task(taskName,taskDescription));
        editor.setTasks(tasks);
        editor.setActiveTask(tasks.size()-1);
        return true;
    }
}
