package com.Array;

import java.util.ArrayList;

public class ArrayListPrintEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			num.add(i);
		}
		System.out.println("-----------printing numbers from 0-50.......---------------");
		for (Integer number : num) {
			System.out.print(number + " ");
		}
		System.out.println("\n");
		System.out.println("----------printing only even numbers from arraylist---------------");
		for (Integer i1 : num) {
			if (i1 % 2 == 0) {
				System.out.print(i1 + " ");
			}
		}

		System.out.println("\n");
		System.out.println("----------------replacing element from 2nd postion----------------------");
		num.remove(2);
        num.add(2, 100);
        System.out.println(num);
	}

}
