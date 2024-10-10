package behavioralPatterns10.command;

public class AdderABC implements Command {

    //Берем value и добавляем к нему константу
    @Override
    public String execute(SomeObject someObject) {
        someObject.setValue(someObject.getValue() + "ABC");
        return "ABC added to the object";
    }
}
