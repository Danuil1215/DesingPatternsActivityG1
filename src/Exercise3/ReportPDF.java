package src.Exercise3;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.*;
import java.util.List;

public class ReportPDF extends Report {

    public ReportPDF() {
        super();
        this.extension = ".pdf";
    }

    @Override
    public void completeFile(File tempPdfFile, List<Employee> employees) {
        Document pdfDocument = new Document(PageSize.A4.rotate(), 0, 0, 20, 0);
        try{
            PdfWriter pdfWriter = PdfWriter.getInstance(pdfDocument, new FileOutputStream(tempPdfFile));
            pdfWriter.setPageEvent(new PdfPageEventHelper() {
                private boolean newPage = true;

                @Override
                public void onStartPage(PdfWriter writer, Document document) {
                    if (newPage) {
                        PdfPTable newRow = new PdfPTable(header.size());
                        addRowInitial(newRow, header);
                        try {
                            document.add(newRow);
                        } catch (DocumentException e) {
                        }
                    }
                    newPage = false;
                }

                @Override
                public void onEndPage(PdfWriter writer, Document document) {
                    newPage = true;
                }
            });
            pdfDocument.open();
            PdfPTable table = new PdfPTable(header.size());
            table.setHeaderRows(0);
            for (Employee employee : employees) {
                addData(table, employee);
            }
            addTotalsData(table);
            pdfDocument.add(table);
            pdfDocument.close();
            pdfWriter.close();
            System.out.println("The file " + tempPdfFile.getName() + " has been generated successfully");
        }catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private void addRowInitial(PdfPTable table, List<String> headerFields) {
        for(String field : headerFields){
            table.addCell(getPdfPCell(field));
        }
    }

    private PdfPCell getPdfPCell(String register) {
        Font customFont = new Font(Font.FontFamily.HELVETICA, 5, Font.NORMAL, BaseColor.BLACK);
        PdfPCell cell = new PdfPCell(new Phrase(register, customFont));
        cell.setBorderColor(BaseColor.BLACK);
        return cell;
    }

    private void addData(PdfPTable table, Employee employee) {
        addEmployeeData(table, employee);
    }
    private void addEmployeeData(PdfPTable table, Employee employee) {
        table.addCell(getPdfPCell(employee.getName()));
        table.addCell(getPdfPCell(String.valueOf(employee.getEarned())));
        table.addCell(getPdfPCell(String.valueOf(employee.getDeducted())));
        table.addCell(getPdfPCell(String.valueOf(employee.getBalance())));

    }

    private void addTotalsData(PdfPTable table) {
        table.addCell(getPdfPCell("TOTALES"));
        table.addCell(getPdfPCell(String.valueOf(this.earnedTotal)));
        table.addCell(getPdfPCell(String.valueOf(this.deductedTotal)));
        table.addCell(getPdfPCell(String.valueOf(this.balanceTotal)));
    }
}
