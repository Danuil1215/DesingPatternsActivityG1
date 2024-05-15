package Exercise1;

import java.util.ArrayList;

public class CommandDelete extends Command{

    CommandDelete(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        backup();
        ArrayList<Task> tasks = new ArrayList<>();
        for(Task task : editor.getTasks()){
            tasks.add(task.copy());
        }
        tasks.remove(editor.getActiveTask().intValue());
        editor.setTasks(tasks);
        return true;
    }
}
