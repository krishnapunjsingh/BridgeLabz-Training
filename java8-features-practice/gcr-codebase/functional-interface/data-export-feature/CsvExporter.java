public class CsvExporter implements DataExporter {

    @Override
    public void exportToCSV() {
        System.out.println("Exporting data to CSV");
    }

    @Override
    public void exportToPDF() {
        System.out.println("Exporting data to PDF from CSV exporter");
    }
}
