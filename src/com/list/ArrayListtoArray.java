package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListtoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> namelist = new ArrayList<String>();
		namelist.add("Don");
		namelist.add("Ram");
		namelist.add("balRam");
		namelist.add("sitaRam");
		namelist.add("jalaRam");
		System.out.println(namelist);

		// case 1=by creating object[] toArray()
		Object[] sarr = new String[namelist.size()];
		sarr = namelist.toArray();

		for (Object s : sarr) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("-----------Case 2----------");

		// case 2=by builtin methods
		String str[] = new String[namelist.size()];
		str = namelist.toArray(str);

		for (String s : str) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println();

		// case 3= by creating methods manually
		System.out.println("---------case 3-----------");
		String strarr[] = new String[namelist.size()];
		for (int i = 0; i < namelist.size(); i++) {
			strarr[i] = namelist.get(i);
		}
		for (String s1 : strarr) {
			// System.out.println("-------case 3-----");
			System.out.print(s1 + " ");
		}
		System.out.println();
		System.out.println();

		// Array to ArrayList
		System.out.println("--------Array to ArrayList------------");
		String s1[] = { "ram", "shyam", "balram", "sitaram" };
		// case1
		List<String> arlist = Arrays.asList(s1);// immutable list cannot add element in it
		for (String s : arlist) {
			System.out.print(s + " ");

		}

		System.out.println();
		System.out.println();
		// case 2
		List<String> nlist = new ArrayList<String>();
		Collections.addAll(nlist, s1);

		System.out.println(nlist);

	}

}
