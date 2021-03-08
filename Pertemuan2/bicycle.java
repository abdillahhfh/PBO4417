public class bicycle {
    public static void main(String[] args) {
        //membuat ocject
        bicycleDemo bike = new bicycleDemo();

        //memanggil atribut dan memberi nilai
        bike.speed = 10;
        bike.gear = 2;
        System.out.println("Kecepatan: "+bike.speed);
        System.out.println("Gear: "+bike.gear);

        //memanggil method dan menunjuk nilai parameter
        bike.speed_up(10);
        bike.change_gear(2);

        System.out.println("Kecepatan ditambah 10: "+bike.speed);
        System.out.println("Gear ditambah 2: "+bike.gear);

    }
}

class bicycleDemo{
    int speed = 0;
    int gear = 0;

    //method
    void change_gear(int newValue) {
        gear = gear + newValue;
    }

    int get_gear(){
        return gear;
    }

    void speed_up(int increment){
        speed = speed + increment;
    }

    int get_speed(){
        return speed;
    }
}
