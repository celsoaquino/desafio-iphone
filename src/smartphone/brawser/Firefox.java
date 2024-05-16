package smartphone.brawser;

public class Firefox implements Browser {
    @Override
    public void addNewTab() {
        System.out.println("New tab added.");
    }

    @Override
    public void showPage() {
        System.out.println("Displaying page...");
    }

    @Override
    public void updatePage() {
        System.out.println("Page updated.");
    }
}
