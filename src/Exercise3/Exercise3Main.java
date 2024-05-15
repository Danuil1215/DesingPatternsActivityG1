package Exercise3;

import java.util.Scanner;

public class Exercise3Main {

    public static void main(String[] args) {
        interactiveMenu();
    }

    private static void interactiveMenu(){
        Scanner myObj = new Scanner(System.in);
        Report generator = new ReportXLSX();
        boolean cycle = true;
        while (cycle)
        {
            System.out.println("Choose the format : (P) PDF | (E) XLSX | (H) HTML | (X) exit ");
            String option = myObj.nextLine();

            switch (option){
                case "P":
                    generator = new ReportPDF();
                    break;
                case "E":
                    generator = new ReportXLSX();
                    break;
                case "H":
                    generator = new ReportHTML();
                    break;
                case "X": cycle = false;
            }

            switch (option){
                case "P":
                case "E":
                case "H":
                    generator.generateReport();
                    break;
            }

        }
    }
}