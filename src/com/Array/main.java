package com.Array;

public class main {

	public static void main(String[] args) {
	    Pen pen = new Pen();

	    pen.setBrand("Parker");
	    pen.setCapLength(5.5);
	    pen.setRefill("Blue", 10, "Steel", 0.7);

	    System.out.println("Brand: " + pen.getBrand());
	    System.out.println("Cap Length: " + pen.getCapLength());

	    Refill refill = pen.getRefill();
	    System.out.println("Ink Color: " + refill.getInkColor());
	    System.out.println("Refill Length: " + refill.getLength());

	    Nib nib = refill.getNib();
	    System.out.println("Nib Material: " + nib.getMaterialType());
	    System.out.println("Nib Width: " + nib.getWidth());
	}


}
