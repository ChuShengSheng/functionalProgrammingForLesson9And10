package structuralPatternsL10.decorator;

public class DataSourceDecoratorMultiplicator implements DataSource {

    private final DataSource dataSource;

    public DataSourceDecoratorMultiplicator(final DataSource dataSource) {
        this.dataSource = dataSource;
    }

    //Изменяя поведение метода, не наделяем его кардинально другой функциональностью
    //Если он не выкидывал runtimeException, то и здесь не должен
    //Если он делал арифметические операции, то и в текущей реализации должен их делать
    //Пользователь понятия не имеет, с какой имплементацией работает, просто берет метод и пользуется им
    @Override
    public int getInteger() {
        return dataSource.getInteger() * 2;
    }
}
