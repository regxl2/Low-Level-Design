package _4_factory_abstractfactory_pattern;


// it is a creation design pattern that used when we want factory of a factory design pattern

interface Button{
    void paint();
}

class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}

class WinButton implements Button{
    @Override
    public void paint() {
        System.out.println("Win Button");
    }
}

interface CheckBox{
    void paint();
}

class MacCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Mac CheckBox");
    }
}

class WinCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Win CheckBox");
    }
}

interface GuiFactory{
    Button createButton();
    CheckBox createCheckBox();
}

class MacGuiFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}

class WinGuiFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}

enum OS{
    MAC,
    WIN
}

class Application{
    private final Button button;
    private final CheckBox checkBox;
    Application(GuiFactory factory){
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }
    void paint(){
        button.paint();
        checkBox.paint();
    }
}

public class AbstractFactoryPattern {
    private static Application configureApplication(OS os){
        if(os == OS.MAC){
            GuiFactory factory = new MacGuiFactory();
            return new Application(factory);
        }
        GuiFactory factory = new WinGuiFactory();
        return new Application(factory);
    }

    public static void main(String[] args) {
        Application application1 = configureApplication(OS.MAC);
        application1.paint();

        Application application2 = configureApplication(OS.WIN);
        application2.paint();
    }
}
