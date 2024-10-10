package creationalPatternsL9.factory;

public class DemoFactoryMethod {
    public static void main(String[] args) {
        // Пример
        // У нас есть какая-то конфигурация
        // и мы хотим читать из разных мест (БД, файл и тфк далее)

        // из файла
        ConfigurationFactory factory1 = ConfigurationFactory.getConfigurationFactory("file"); //получили фабрику
        Configuration config1 = factory1.buildConfiguration(); // получили конфиг
        readData(config1); // читаем конфиг

        //из бд
        ConfigurationFactory factory2 = ConfigurationFactory.getConfigurationFactory("bd"); //получили фабрику
        Configuration config2 = factory2.buildConfiguration(); // получили конфиг
        readData(config2); // читаем конфиг
    }

    private static void readData(Configuration config) {
        //...
    }
}
