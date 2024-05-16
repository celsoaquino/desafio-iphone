package smartphone;

import smartphone.brawser.Browser;
import smartphone.player.Player;
import smartphone.telephone.Telephone;

public class Main {
    public static void main(String[] args) {
        iPhone iPhone = new iPhone();

        System.out.println("Using iPhone music player");
        Player player = iPhone;
        player.selectMusic();
        player.play();
        player.pause();

        System.out.println("\nUsing iPhone internet browser");
        Browser browser = iPhone;
        browser.addNewTab();
        browser.showPage();
        browser.updatePage();

        System.out.println("\nUsing iPhone telephone");
        Telephone telephone = iPhone;
        telephone.call();
        telephone.answer();
        telephone.startVoiceMail();
    }
}
