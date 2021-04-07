package Praktikum;

public class MotorCycle extends MotorVehicle {
    int numGear = 0;

    MotorCycle(){}

    public void setGearFoot(int numGear) {
        this.numGear = numGear;
    }

    public int getGearFoot() {
        return numGear;
    }
}
