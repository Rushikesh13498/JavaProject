package com.Array;

public class Refill {
    private String inkColor;
    private double length;
    private Nib nib;

    public Refill() {
        inkColor = "";
        length = 0;
        nib = new Nib();
    }

    public void setInkColor(String inkColor) {
        this.inkColor = inkColor;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setNib(Nib nib) {
        this.nib = nib;
    }

    public String getInkColor() {
        return inkColor;
    }

    public double getLength() {
        return length;
    }

    public Nib getNib() {
        return nib;
    }
}

