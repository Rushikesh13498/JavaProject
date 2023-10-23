package com.filehandling;

import java.io.*;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file=new File("file1.txt");//path or file name of file
		/*
		 * boolean test=file.createNewFile(); if(test) {
		 * System.out.println("file created"); }else {
		 * System.out.println("not created"); }
		 */
		
		if(file.exists()) {
			System.out.println("yes");
			System.out.println("file name:"+file.getName());
			System.out.println("path:"+file.getAbsolutePath());
			System.out.println("is writable:"+file.canWrite());
			System.out.println("is readable:"+file.canRead());
			System.out.println("length:"+file.length());
			System.out.println(file.toPath());
		}else {
			System.out.println("file not found");
		}
		                        
		
	}

}
