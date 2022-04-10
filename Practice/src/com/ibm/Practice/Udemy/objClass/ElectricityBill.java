package com.ibm.Practice.Udemy.objClass;

public class ElectricityBill {

    private int meterNo;
    private String name;
    private String address;

    public int getMeterNo() {
        return meterNo;
    }

    public void setMeterNo(int meterNo) {
        this.meterNo = meterNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + meterNo;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ElectricityBill other = (ElectricityBill) obj;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (meterNo != other.meterNo)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ElectricityBill [address=" + address + ", meterNo=" + meterNo + ", name=" + name + "]";
    }

}
