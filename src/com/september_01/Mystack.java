package com.september_01;

import java.util.*;
public class Mystack {
	static int size;
	int index;
	int arr[]=new int[size];
	
	
	public boolean isFull() {
		if(size==index) {
			System.out.println("Array is full");
			return true;
		}else {
			return false;
		}
	}
	
	
	
	boolean isEmpty() {
		if(index==0) {
			System.out.println("Array is empty");
			return true;
			
		}else {
			return false;
		}
	}
	
	
	public  void stackPush(int element) {
		if(isFull()) {
			System.out.println("Stack is full");
			
		}else {
			for(int i=0;i<arr.length;i++) {
		     arr[index++]=element;
		
		}
		}
		
	}

	
	
	
	public int stackPop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}else{
			return arr[index];
		}
		
		
		
	}
}
