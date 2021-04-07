package Praktikum;

public class Car extends MotorVehicle {
    boolean setBelt = false;
    
    Car(){}

    public void setSeatBelt(int seatBelt) {
        if(seatBelt == 1){
            this.setBelt = true;
        } else if(seatBelt == 0){
            this.setBelt = false;
        }
    }

    public boolean getSeatBelt() {
        return setBelt;
    }
}
