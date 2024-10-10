package structuralPatternsL10.decorator;

public class DataSourceImpl implements DataSource {
    @Override
    public int getInteger() {
        return 15;
    }
}
