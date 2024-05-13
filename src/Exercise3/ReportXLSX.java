package Exercise3;

import org.dhatim.fastexcel.Workbook;
import org.dhatim.fastexcel.Worksheet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ReportXLSX extends Report {

    private int maxRow;
    private int sheetCurrent;

    public ReportXLSX() {
        super();
        this.extension = ".xlsx";
        this.maxRow = 9999;
        this.sheetCurrent = 1;
    }

    @Override
    public void completeFile(File file, List<Employee> employees) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        Workbook wb = new Workbook(fos, "Application", "1.0");
        Worksheet ws = wb.newWorksheet("Hoja " + sheetCurrent);
        addRowInitial(ws, this.header);
        for (int i = 0; i < employees.size(); i++) {
            if (i > 0 && i % maxRow == 0) {
                ws = wb.newWorksheet("Hoja " + (i / maxRow + 1));
                addRowInitial(ws, this.header);
            }
            addData(ws, i % maxRow + 1,  employees.get(i));
        }
        addTotalsData(ws,employees.size() % maxRow + 1);
        wb.finish();
        fos.close();
        System.out.println("The file "+nameFile+" has been generated successfully");
        System.gc();
    }

    private void addRowInitial(Worksheet ws, List<String> headerFields) {
        int col = 0;
        for(String field : headerFields){
            ws.value(0, col, field);
            col++;
        }
    }

    private void addData(Worksheet ws, int row, Employee employee) {
        addEmployeesData( ws, row, employee);
    }

    private void addEmployeesData(Worksheet ws, int row, Employee employee) {
        ws.value(row, 0, employee.getName());
        ws.value(row, 1, employee.getEarned());
        ws.value(row, 2, employee.getDeducted());
        ws.value(row, 3, employee.getBalance());
    }

    private void addTotalsData(Worksheet ws, int row) {
        ws.value(row, 0, "TOTALES");
        ws.value(row, 1, this.earnedTotal);
        ws.value(row, 2, this.deductedTotal);
        ws.value(row, 3, this.balanceTotal);
    }

}
