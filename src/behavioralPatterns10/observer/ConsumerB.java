package behavioralPatterns10.observer;

public class ConsumerB {
    // Если listener не является всем классом, то его можно выделить в отдельный объект
    // Позволяет не помещать в продюсер весь класс, а только маленький слушатель
    private static final Listener listener = data -> System.out.println("Consumer B data: " + data);

    public Listener getListener() {
        return listener;
    }
}
