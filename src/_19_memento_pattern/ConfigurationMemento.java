package _19_memento_pattern;

public class ConfigurationMemento {
    private final int height;
    private final int width;

    public ConfigurationMemento(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int getHeight(){
        return height;
    }

    public int getWidth(){
        return width;
    }

}
