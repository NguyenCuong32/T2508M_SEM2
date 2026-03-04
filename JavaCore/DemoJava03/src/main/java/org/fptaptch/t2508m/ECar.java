package org.fptaptch.t2508m;

public class ECar implements IECar,IVehicle {


    @Override
    public void setPower(double power) {
        System.out.println("Car power "+power);
    }

    @Override
    public void run() {
        System.out.println("Car run");
    }

    @Override
    public void stop() {
        System.out.println("Car stop");
    }
}
