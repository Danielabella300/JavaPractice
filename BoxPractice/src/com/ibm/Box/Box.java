package com.ibm.Box;

public class Box {
    private double height;
    private double width;
    private double length;

    Box( double h, double w, double l)
    {
        setHeight(h);
        setWidth(w);
        setLength(l);
    }

    Box(double side)
    {
        //height = width = length = side;
        this(side,side,side);
    }

    public double getVolume()
    {
        return getHeight() * getWidth() * getLength();
    }

    public double getSurfaceArea()
    {
        return 2 * ((getHeight() * getWidth()) + (getWidth() * getLength()) + (getHeight() * getLength()));
    }

    public void printBox()
    {
        if(getHeight() <= 0 || getLength() <= 0 || getWidth() <= 0) {
            System.out.printf("Box (%f,%f,%f) contains invalid properties \n", getHeight(), getWidth(), getLength());
            if(getHeight() <= 0)
            {
                System.out.println("Invalid property Height has been changed to 1");
                setHeight(1);
                System.out.println("Box length is: " + getLength());
                System.out.println("Box width is: " + getWidth());
                System.out.println("Box height is: " + getHeight());
                System.out.println("Box volume is: "  + getVolume());
                System.out.println("Box surface area is: "  + getSurfaceArea());
            }
            else if(getLength() <= 0)
            {
                setLength(1);
                System.out.println("Invalid property Length has been changed to 1");
                System.out.println("Box length is: " + getLength());
                System.out.println("Box width is: " + getWidth());
                System.out.println("Box height is: " + getHeight());
                System.out.println("Box volume is: "  + getVolume());
                System.out.println("Box surface area is: "  + getSurfaceArea());
            }
            else
            {
                setWidth(1);
                System.out.println("Invalid property Width has been changed to 1");
                System.out.println("Box length is: " + getLength());
                System.out.println("Box width is: " + getWidth());
                System.out.println("Box height is: " + getHeight());
                System.out.println("Box volume is: "  + getVolume());
                System.out.println("Box surface area is: "  + getSurfaceArea());
            }
        }
        else
        {
            System.out.println("Box length is: " + getLength());
            System.out.println("Box width is: " + getWidth());
            System.out.println("Box height is: " + getHeight());
            System.out.println("Box volume is: "  + getVolume());
            System.out.println("Box surface area is: "  + getSurfaceArea());
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
