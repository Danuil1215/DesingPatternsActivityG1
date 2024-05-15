package src.Exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class CommandUpdate extends Command{

    CommandUpdate(Editor editor) {
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
        System.out.print("Enter new name for task :  ");
        String taskName = myObj.nextLine();
        System.out.print("Enter new description for task :  ");
        String taskDescription = myObj.nextLine();
        tasks.get(editor.getActiveTask()).setName(taskName);
        tasks.get(editor.getActiveTask()).setDescription(taskDescription);
        editor.setTasks(tasks);
        return true;
    }
}
