package creationalPatternsL9.factory;

public class ConfigurationFactorDB extends ConfigurationFactory {
    @Override
    Configuration buildConfiguration(){
        return new ConfigurationDB();
    }
}
