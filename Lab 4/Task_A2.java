// Using Adapter pattern to make SmartRemote and GeneralRemote operate both GeneralTV and SmartT       
// Using Proxy pattern to access Youtube() on SmartTV

interface TV {
    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int volume);
    int getChannel();
    void setChannel(int channel);
}

class GeneralTV implements TV {
    private boolean powerOn;
    private int volume;
    private int channel;

    public GeneralTV() {
        powerOn = false;
        volume = 10;
        channel = 1;
    }

    public boolean isEnabled() {
        return powerOn;
    }

    public void enable() {
        powerOn = true;
    }

    public void disable() {
        powerOn = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }
}

class TVAdapter implements TV {
    private TV tv;

    public TVAdapter(TV tv) {
        this.tv = tv;
    }

    public boolean isEnabled() {
        return tv.isEnabled();
    }

    public void enable() {
        tv.enable();
    }

    public void disable() {
        tv.disable();
    }

    public int getVolume() {
        return tv.getVolume();
    }

    public void setVolume(int volume) {
        tv.setVolume(volume);
    }

    public int getChannel() {
        return tv.getChannel();
    }

    public void setChannel(int channel) {
        tv.setChannel(channel);
    }
}

interface Remote {
    void togglePower();
    void volumeUp();
    void volumeDown();
    void channelUp();
    void channelDown();
}

class SmartRemote implements Remote {
    private TV tv;

    public SmartRemote(TV tv) {
        this.tv = tv;
    }

    public void togglePower() {
        if (tv.isEnabled())
            tv.disable();
        else
            tv.enable();
    }

    public void volumeUp() {
        int volume = tv.getVolume();
        tv.setVolume(volume + 1);
    }

    public void volumeDown() {
        int volume = tv.getVolume();
        tv.setVolume(volume - 1);
    }

    public void channelUp() {
        int channel = tv.getChannel();
        tv.setChannel(channel + 1);
    }

    public void channelDown() {
        int channel = tv.getChannel();
        tv.setChannel(channel - 1);
    }
}

class SmartTVProxy implements TV {
    private TV smartTV;

    public SmartTVProxy(TV tv) {
        this.smartTV = tv;
    }

    public boolean isEnabled() {
        return smartTV.isEnabled();
    }

    public void enable() {
        smartTV.enable();
    }

    public void disable() {
        smartTV.disable();
    }

    public int getVolume() {
        return smartTV.getVolume();
    }

    public void setVolume(int volume) {
        smartTV.setVolume(volume);
    }

    public int getChannel() {
        return smartTV.getChannel();
    }

    public void setChannel(int channel) {
        smartTV.setChannel(channel);
    }

    public void Youtube() {
        System.out.println("Accessing YouTube on SmartTV...");
    }
}

public class Task_A2 {
    public static void main(String[] args) {
 
        TV generalTV = new GeneralTV();
        TVAdapter generalTVAdapter = new TVAdapter(generalTV);
        SmartRemote smartRemote = new SmartRemote(generalTVAdapter);

        smartRemote.togglePower();
        System.out.println("Volume: " + generalTV.getVolume());

        
        TV smartTV = new GeneralTV();
        SmartTVProxy smartTVProxy = new SmartTVProxy(smartTV);
        smartTVProxy.Youtube();
    }
}
