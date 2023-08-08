package com.Array;

public class Nib {
    private String materialType;
    private double width;

    public Nib() {
        materialType = "";
        width = 0;
    }

    public Nib(String materialType, double width) {
        this.materialType = materialType;
        this.width = width;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getMaterialType() {
        return materialType;
    }

    public double getWidth() {
        return width;
    }
}

