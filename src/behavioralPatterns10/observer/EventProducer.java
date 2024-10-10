package behavioralPatterns10.observer;

import java.util.ArrayList;
import java.util.List;

public class EventProducer {
    private final List<Listener> listeners = new ArrayList<>();

    public void addListener(Listener listener) {
        listeners.add(listener);
    }

    public void event(String data) {
        listeners.forEach(listener -> {
            // Чтобы при исключении в одном из подписчиков не страдали остальные делаем try catch
            try {
                listener.onUpdate(data);
            } catch (Exception e) {
                // какой-то лог
            }
        });
    }

    public void removeListener(Listener listener) {
        listeners.remove(listener);
    }
}
