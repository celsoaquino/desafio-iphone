package smartphone.player;


public class Music implements Player {
    @Override
    public void selectMusic() {
        System.out.println("Select music...");
    }

    @Override
    public void play() {
        System.out.println("Playing music...");
    }

    @Override
    public void pause() {
        System.out.println("Pause music.");
    }
}
