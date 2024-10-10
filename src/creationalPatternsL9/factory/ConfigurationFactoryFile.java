package creationalPatternsL9.factory;

public class ConfigurationFactoryFile extends ConfigurationFactory {
    @Override
    Configuration buildConfiguration() {
        return new ConfigurationFile();}
}
