package behavioralPatterns10.command;

public class Echo implements Command {
    @Override
    public String execute(SomeObject someObject) {
        return someObject.getValue();
    }
}
