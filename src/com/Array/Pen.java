package com.Array;

public class Pen {
    private Refill refill;
    private double capLength;
    private String brand;

    public Pen() {
        refill = new Refill();
        capLength = 0;
        brand = "";
    }

    public void setRefill(String inkColor, double length, String nibMaterial, double nibWidth) {
        refill.setInkColor(inkColor);
        refill.setLength(length);
        Nib nib = new Nib(nibMaterial, nibWidth);
        refill.setNib(nib);
    }

    public void setCapLength(double length) {
        capLength = length;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Refill getRefill() {
        return refill;
    }

    public double getCapLength() {
        return capLength;
    }

    public String getBrand() {
        return brand;
    }
}


