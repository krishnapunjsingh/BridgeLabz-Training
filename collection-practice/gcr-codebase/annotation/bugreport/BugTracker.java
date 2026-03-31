public class BugTracker {

    @BugReport(description = "NullPointerException on empty input")
    @BugReport(description = "Performance issue for large data")
    public void process() {
        System.out.println("Processing data...");
    }
}
