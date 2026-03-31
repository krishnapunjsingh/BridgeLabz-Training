public class PdfExporter implements DataExporter {

    @Override
    public void exportToCSV() {
        System.out.println("Exporting data to CSV from PDF exporter");
    }

    @Override
    public void exportToPDF() {
        System.out.println("Exporting data to PDF");
    }
}
