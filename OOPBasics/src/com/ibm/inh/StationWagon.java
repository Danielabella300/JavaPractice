package com.ibm.inh;

public class StationWagon extends Car{
    private int CargoCapacity;
    private int currentCargoLoad;

    public int getCargoCapacity() {
        return this.CargoCapacity;
    }

    public void setCargoCapacity(int CargoCapacity) {
        this.CargoCapacity = CargoCapacity;
    }

    public int getCurrentCargoLoad() {
        return this.currentCargoLoad;
    }

    public void setCurrentCargoLoad(int currentCargoLoad) {
        this.currentCargoLoad = currentCargoLoad;
    }

    public void setSpeed(int speed)
    {
        
    }

}
