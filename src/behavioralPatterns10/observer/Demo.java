package behavioralPatterns10.observer;

public class Demo {
    public static void main(String[] args) {
        var producer = new EventProducer(); // источник событий
        var consumerA = new ConsumerA(); // подписант 1
        var consumerB = new ConsumerB(); // подписант 2

        // подписываемся на уведомления
        producer.addListener(consumerA);
        producer.addListener(consumerB.getListener());

        // создаем событие
        producer.event("eventA");
        producer.event("eventB");

        // отписываемся
        producer.removeListener(consumerA);
        producer.removeListener(consumerB.getListener());

        // продолжаем генерировать события
        producer.event("eventC");
        producer.event("eventD");
    }
}
