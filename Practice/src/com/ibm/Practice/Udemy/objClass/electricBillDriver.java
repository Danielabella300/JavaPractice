package com.ibm.Practice.Udemy.objClass;

public class electricBillDriver {
    public static void main(String[] args) {
        ElectricityBill customer1 = new ElectricityBill();
        customer1.setMeterNo(1);
        customer1.setName("Daniel Abella");
        customer1.setAddress("3658 Dunlin Shore ct");

        ElectricityBill customer2 = new ElectricityBill();
        customer2.setMeterNo(1);
        customer2.setName("Daniel Abella");
        customer2.setAddress("3658 Dunlin Shore ct");

        System.out.println(customer1.equals(customer2));

        System.out.println(customer1.toString());
        System.out.println(customer1.hashCode());
        System.out.println(customer2.hashCode());
        customer1.setAddress("lmao");
        System.out.println(customer1.hashCode());
    }
}
