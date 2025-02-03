package _19_memento_pattern;

public class ConfigurationOriginator {
    private int height;
    private int width;

    public ConfigurationOriginator(int height, int width){
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public ConfigurationMemento createMemento(){
        return new ConfigurationMemento(height, width);
    }

    public void restoreMemento(ConfigurationMemento memento){
        height = memento.getHeight();
        width = memento.getWidth();
    }

    @Override
    public String toString() {
        return "ConfigurationOriginator ( height = " + height + ", width = " + width + " )";
    }
}
