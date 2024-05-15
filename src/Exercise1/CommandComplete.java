package src.Exercise1;

import java.util.ArrayList;

public class CommandComplete extends Command{

    CommandComplete(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        backup();
        ArrayList<Task> tasks = new ArrayList<>();
        for(Task task : editor.getTasks()){
            tasks.add(task.copy());
        }
        tasks.get(editor.getActiveTask()).setCompleted(true);
        editor.setTasks(tasks);
        return true;
    }
}
