public class ParcelRoute {

    private StageNode head;

    // Initialize default stages
    public void initializeRoute() {
        head = new StageNode("Packed");
        head.next = new StageNode("Shipped");
        head.next.next = new StageNode("In Transit");
        head.next.next.next = new StageNode("Delivered");
    }

    // Track parcel forward
    public void trackParcel() {
        StageNode current = head;

        if (current == null) {
            System.out.println("Parcel lost or route missing.");
            return;
        }

        while (current != null) {
            System.out.println("Current Stage: " + current.stage);
            current = current.next;
        }
    }

    // Add intermediate checkpoint after a stage
    public void addCheckpoint(String afterStage, String newStage) {
        StageNode current = head;

        while (current != null && !current.stage.equals(afterStage)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Stage not found. Cannot add checkpoint.");
            return;
        }

        StageNode checkpoint = new StageNode(newStage);
        checkpoint.next = current.next;
        current.next = checkpoint;

        System.out.println("Checkpoint added after " + afterStage);
    }
}
