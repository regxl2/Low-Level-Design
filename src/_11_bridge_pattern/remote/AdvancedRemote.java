package _11_bridge_pattern.remote;

import _11_bridge_pattern.device.Device;

public class AdvancedRemote extends BasicRemote{
    AdvancedRemote(Device device) {
        super(device);
    }
    public void mute(){
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
