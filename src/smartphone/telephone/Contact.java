package smartphone.telephone;

public class Contact implements Telephone {
    @Override
    public void call() {
        System.out.println("Calling...");
    }

    @Override
    public void answer() {
        System.out.println("Answering call...");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Starting voicemail...");
    }
}
