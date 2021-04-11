package Praktikum;

public class UjiKendaraan {

    public static void kendaraanMelaju(Vehicle vehicle){
        vehicle.goStraight();
    }

    public static void main(String[] args) {
        
        kendaraanMelaju(new Vehicle());
        kendaraanMelaju(new Bicycle());
        kendaraanMelaju(new MotorVehicle());
    
    }
}
