package _19_memento_pattern;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {
    private final List<ConfigurationMemento> history = new ArrayList<>();

    public void addMemento(ConfigurationMemento memento){
        history.add(memento);
    }

    public ConfigurationMemento undo(){
        if(history.isEmpty()) return null;
        return history.removeLast();
    }
}
