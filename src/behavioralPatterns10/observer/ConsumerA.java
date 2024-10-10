package behavioralPatterns10.observer;

public class ConsumerA implements Listener {

    @Override
    public void onUpdate(String data) {
        System.out.println("ConsumerA onUpdate: " + data);
    }
}
