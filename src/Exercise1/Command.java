package src.Exercise1;

import java.util.ArrayList;

public abstract class Command {
    public Editor editor;
    private ArrayList<Task> tasksBackup;
    private Integer activeTaskBackup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        tasksBackup = editor.getTasks();
        activeTaskBackup = editor.getActiveTask();
    }

    public void undo() {
        editor.setTasks(tasksBackup);
        editor.setActiveTask(activeTaskBackup);
    }

    public abstract boolean execute();
}
