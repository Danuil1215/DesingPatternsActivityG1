package Exercise3;

import com.itextpdf.text.DocumentException;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public abstract  class Report {

    protected String extension;
    protected String nameFile;
    protected List<String> header;
    protected Integer earnedTotal;
    protected Integer deductedTotal;
    protected Integer balanceTotal;

    protected Report() {
        header = List.of("Nombre","Devengado","Deducido","Pagado");
    }

    protected List<Employee> getEmployeesFromBD(){
        return BDRepository.getEmployees();
    }

    protected void calculateTotal(List<Employee> employees){
        this.earnedTotal = 0;
        this.deductedTotal = 0;
        this.balanceTotal = 0;
        for(Employee employee: employees){
            this.earnedTotal += employee.getEarned();
            this.deductedTotal += employee.getDeducted();
            this.balanceTotal += employee.getBalance();
        }
    }

    protected File initializeFile(){
        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        String dateFormatter = currentDate.format(formatter);
        nameFile = "employees_" + dateFormatter + extension;
        try {
            return new File(nameFile);
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public abstract void completeFile(File file, List<Employee> employees);

    protected void generateReport()  {
        List<Employee> employees = getEmployeesFromBD();
        calculateTotal(employees);
        File file = initializeFile();
        try {
            completeFile(file, employees);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


}
