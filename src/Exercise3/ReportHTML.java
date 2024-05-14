package Exercise3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportHTML extends Report {

    public ReportHTML() {
        super();
        this.extension = ".html";
    }

    @Override
    public void completeFile(File file, List<Employee> employees) {
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("<!DOCTYPE html> <html lang=\"en\"> <head> <meta charset=\"UTF-8\"> <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><title>Document</title></head><body><table>");
            addRowInitial(fileWriter);
            addData(fileWriter,employees);
            addTotalsData(fileWriter);
            fileWriter.write("</table></body></html>");
            System.out.println("The file "+file.getName()+" has been generated successfully");
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero " + e);
        }
    }

    private void addRowInitial(FileWriter fich) throws IOException {
        fich.write("<tr>");
        for(String field : header){
            fich.write("<td>");
            fich.write(field);
            fich.write("</td>");
        }
        fich.write("</tr>");
    }

    private void addData(FileWriter fileWriter, List<Employee> employees) throws IOException {
        for(Employee employee : employees){
            fileWriter.write("<tr>");
            fileWriter.write("<td>"+employee.getName()+"</td>");
            fileWriter.write("<td>"+employee.getEarned()+"</td>");
            fileWriter.write("<td>"+employee.getDeducted()+"</td>");
            fileWriter.write("<td>"+employee.getBalance()+"</td>");
            fileWriter.write("</tr>");
        }
    }

    private void addTotalsData(FileWriter fileWriter) throws IOException {
        fileWriter.write("<tr><td>TOTALES</td>");
        fileWriter.write("<td>"+this.earnedTotal+"</td>");
        fileWriter.write("<td>"+this.deductedTotal+"</td>");
        fileWriter.write("<td>"+this.balanceTotal+"</td></tr>");
    }

}
