package com.ibm.inh;

public class SportsCar extends Car{
    private int horsePower;

    public int getHorsePower() {
        return this.horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getSpeed()
    {
        return super.getSpeed() * 2;
    }

}
