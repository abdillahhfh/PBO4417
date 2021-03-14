public class TestTV {
    public static void main(String[] args) {

        Manusia man1 = new Manusia("Abdillah");
        System.out.println(man1.namaSaya());

        TV tvku = new TV();
        System.out.println(man1.cekTV());
        man1.beliTV(tvku);
        System.out.println(man1.cekTV());
        man1.jualSemuaTV();
        System.out.println(man1.cekTV());

    }
}

class TV{
    int channel = 1;
    int volumeLevel = 1;
    boolean on;

    public TV(){}

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
}