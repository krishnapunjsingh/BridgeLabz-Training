public class AdvancedExporter implements DataExporter {

    @Override
    public void exportToCSV() {
        System.out.println("Advanced CSV export");
    }

    @Override
    public void exportToPDF() {
        System.out.println("Advanced PDF export");
    }

    @Override
    public void exportToJSON() {
        System.out.println("Exporting data to JSON with custom logic");
    }
}
