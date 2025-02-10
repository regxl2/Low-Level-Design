package _22_command_pattern;

// This is a receiver

public class AirConditioner{
    private boolean isOn;
    private int temperature;

    public AirConditioner(){
        isOn = false;
        temperature = 36;
    }

    public void turnOnAc(){
        isOn = true;
        System.out.println("AC is turned on");
    }

    public void turnOffAc(){
        isOn = false;
        System.out.println("AC is turned off");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("AC's temperature is set to: " + temperature);
    }
}
