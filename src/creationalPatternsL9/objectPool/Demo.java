package creationalPatternsL9.objectPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {
        // Конструктор в куче
        String str1 = "Hello World";
        String str2 = "Hello World";
        System.out.println(str1 == str2);

        //Создание нового экземпляра
        String str3 = new String("Hello World");
        String str4 = new String("Hello World");
        System.out.println(str3 == str4);

        //Интернирование
        String str5 = new String("Hello World").intern();
        System.out.println(str1 == str5);

        //Один поток
        Thread thread = new Thread(() -> System.out.println("Hello from thread"));
        thread.start();

        // Пул с 5 потоками
        ExecutorService fixed = Executors.newFixedThreadPool(5);
        fixed.submit(() -> System.out.println("Hello from Fixed"));

        //Кэширующий пул потоков, создает потоки по мере необходимости
        //переиспользует неактивные потоки
        ExecutorService cached = Executors.newCachedThreadPool();
        cached.submit(() -> System.out.println("Hello from Fixed"));
    }
}
