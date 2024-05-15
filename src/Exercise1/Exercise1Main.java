package Exercise1;

import java.util.Scanner;

public class Exercise1Main {

    public static void main(String[] args) {
        interactiveMenu();
    }

    private static void interactiveMenu(){
        Editor editor = new Editor();
        Scanner myObj = new Scanner(System.in);
        boolean cycle = true;
        while (cycle)
        {
            editor.printTasks();
            System.out.println("(C) create | (U) update | (D) delete | (T) complete | (R) undo | (X) exit | (Q) up | (A) down");
            String option = myObj.nextLine();

            switch (option.toUpperCase()){
                case "C":
                    editor.executeCommand(new CommandCreate(editor));
                    break;
                case "U":
                    editor.executeCommand(new CommandUpdate(editor));
                    break;
                case "D":
                    editor.executeCommand(new CommandDelete(editor));
                    break;
                case "T":
                    editor.executeCommand(new CommandComplete(editor));
                    break;
                case "R":
                    editor.undo();
                    break;
                case "A":
                    editor.setActiveTask((editor.getActiveTask().intValue()<editor.getTasks().size()-1) ? editor.getActiveTask()+1 : editor.getActiveTask());
                    break;
                case "Q":
                    editor.setActiveTask((editor.getActiveTask().intValue()>0)? editor.getActiveTask()-1 : 0);
                    break;
                case "X": cycle = false;
            }
        }
    }
}