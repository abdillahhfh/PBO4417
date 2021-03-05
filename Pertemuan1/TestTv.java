public class TestTV {
    int channel;
    int volumeLevel;
    boolean on;

    public TestTV(){}

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
       channel = newChannel;
    }

    public void setVolume(int newVolumeLevel) {
        volumeLevel = newVolumeLevel;
    }

    public void channelUp() {
        channel++;
    }

    public void channelDown() {
        channel--;
    }

    public void volumeUp() {
        volumeLevel++;
    }

    public void volumeDown() {
        volumeLevel--;
    }

    public static void main(String[] args) {
        TestTV tv1 = new TestTV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TestTV tv2 = new TestTV();
        tv2.turnOn();
        tv2.setChannel(3);
        tv2.setVolume(2);

        System.out.println("tv1's channel is "+tv1.channel+" and volume level is "+ tv1.volumeLevel);
        System.out.println("tv2's channel is "+tv2.channel+" and volume level is "+ tv2.volumeLevel);
    }
}
