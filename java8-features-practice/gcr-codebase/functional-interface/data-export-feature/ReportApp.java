public class ReportApp {

    public static void main(String[] args) {

        DataExporter csv = new CsvExporter();
        DataExporter pdf = new PdfExporter();
        DataExporter advanced = new AdvancedExporter();

        csv.exportToCSV();
        csv.exportToJSON();     

        pdf.exportToPDF();
        pdf.exportToJSON();     

        advanced.exportToJSON();  
    }
}
