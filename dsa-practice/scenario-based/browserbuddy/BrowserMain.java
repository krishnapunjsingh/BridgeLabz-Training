public class BrowserMain {

    public static void main(String[] args) {

        BrowserTab tab = new BrowserTab();
        TabManager manager = new TabManager();

        tab.visit("google.com");
        tab.visit("github.com");
        tab.visit("stackoverflow.com");

        tab.back();
        tab.back();
        tab.forward();

        manager.closeTab(tab);

        BrowserTab restoredTab = manager.reopenTab();
        System.out.println("Current Page: " + restoredTab.getCurrentPage());
    }
}
