package _19_memento_pattern;

public class Demo {
    public static void main(String[] args) {
        ConfigurationOriginator originator = new ConfigurationOriginator(10, 10);
        ConfigurationCareTaker careTaker = new ConfigurationCareTaker();

        ConfigurationMemento snapshot1 = originator.createMemento();
        careTaker.addMemento(snapshot1);

        originator.setHeight(15);
        originator.setWidth(25);

        ConfigurationMemento snapshot2 = originator.createMemento();
        careTaker.addMemento(snapshot2);

        originator.setWidth(25);
        originator.setHeight(10);

        ConfigurationMemento previousMemento = careTaker.undo();

        originator.restoreMemento(previousMemento);
        System.out.println(originator);

        previousMemento = careTaker.undo();

        originator.restoreMemento(previousMemento);
        System.out.println(originator);
    }
}

