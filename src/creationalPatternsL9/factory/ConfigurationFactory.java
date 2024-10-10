package creationalPatternsL9.factory;

public abstract class ConfigurationFactory {
    public static ConfigurationFactory getConfigurationFactory(String type) {
        if (type.equals("file")) {
            return new ConfigurationFactoryFile();
        } else {
            return new ConfigurationFactorDB();
        }
    }

    abstract Configuration buildConfiguration();
}
