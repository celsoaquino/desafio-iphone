package smartphone;

import smartphone.brawser.Browser;
import smartphone.brawser.Firefox;
import smartphone.player.Music;
import smartphone.player.Player;
import smartphone.telephone.Telephone;

public class iPhone implements Player, Browser, Telephone {

    @Override
    public void play() {
        System.out.println("playing music on iPhone...");
    }

    @Override
    public void pause() {
        System.out.println("Pause music on iPhone.");
    }

    @Override
    public void selectMusic() {
        System.out.println("Select music on iPhone...");
    }

    @Override
    public void showPage() {
        System.out.println("Displaying page on iPhone...");
    }

    @Override
    public void addNewTab() {
        System.out.println("New tab added on iPhone.");
    }

    @Override
    public void updatePage() {
        System.out.println("Page updated on iPhone.");
    }

    @Override
    public void call() {
        System.out.println("Calling on iPhone...");
    }

    @Override
    public void answer() {
        System.out.println("Answering call on iPhone...");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Starting voicemail on iPhone...");
    }
}
