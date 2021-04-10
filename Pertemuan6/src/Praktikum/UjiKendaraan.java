package Praktikum;

public class UjiKendaraan {

    
    public static void kendaraanMelaju(Vehicle v1){
        v1.goStraight();
    }

    public static void main(String[] args) {
        Vehicle vv1 = new Vehicle();
        Bicycle b1 = new Bicycle();
        Car c1 = new Car();

        
        
        // UjiKendaraan u1 = new UjiKendaraan();
        UjiKendaraan.kendaraanMelaju(vv1);
        
        // UjiKendaraan u2 = new UjiKendaraan();
        // u2.kendaraanMelaju(b1);
        
        System.out.println(c1.getSeatBelt());
        c1.setSeatBelt(1);
        System.out.println(c1.getSeatBelt());
        c1.setSeatBelt(0);
        System.out.println(c1.getSeatBelt());
        c1.setSeatBelt(2);
        System.out.println(c1.getSeatBelt());
        
        
    }
    

}
