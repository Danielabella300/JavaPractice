package com.ibm.Box;

public class Cube extends Box{
    private double side;

    Cube(double side) {
        super(side);
        //TODO Auto-generated constructor stub

    }

    public void setHeight(double height)
    {
        if(height != super.getHeight())
        {
            super.setHeight(height);
            super.setLength(height);
            super.setWidth(height);
        }
    }

    public void setWidth(double width)
    {
        if(width != super.getHeight())
        {
            super.setHeight(width);
            super.setLength(width);
            super.setWidth(width);
        }
    }

    public void setLength(double length)
    {
        if(length != super.getHeight())
        {
            super.setHeight(length);
            super.setLength(length);
            super.setWidth(length);
        }
    }
    
    public void printCube()
    {
        System.out.println("Box length is: " + getLength());
        System.out.println("Box width is: " + getWidth());
        System.out.println("Box height is: " + getHeight());
    }

    public double getSide() 
    {
        return this.side;
    }

    public void setSide(double side) 
    {
        super.setHeight(side);
        super.setLength(side);
        super.setWidth(side);
    }
}
