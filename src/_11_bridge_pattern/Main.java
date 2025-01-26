package _11_bridge_pattern;

//Bridge is a structural design pattern that divides
//business logic or huge class into separate class hierarchies
//that can be developed independently.
//It is similar to a strategy pattern, Strategy is a behavioral design pattern that lets you define a family of algorithms,
// put each of them into a separate class, and make their objects interchangeable.

import _11_bridge_pattern.device.Device;
import _11_bridge_pattern.device.Radio;
import _11_bridge_pattern.device.Tv;
import _11_bridge_pattern.remote.AdvancedRemote;
import _11_bridge_pattern.remote.BasicRemote;


class Main {
    public static void main(String[] args) {
        System.out.println("Tests with basic remote and Tv");
        Device tv = new Tv();
        BasicRemote basicRemote = new BasicRemote(tv);
        basicRemote.power();
        tv.printStatus();

        System.out.println("Tests with advanced remote and radio");
        Device radio = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
        advancedRemote.power();
        advancedRemote.mute();
        radio.printStatus();
    }
}
