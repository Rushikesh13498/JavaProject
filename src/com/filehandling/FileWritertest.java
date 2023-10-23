package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileWriter fw=null;
		try {
			fw=new FileWriter("myd.txt");
			System.out.println("file created");
			String data="hello world";
			fw.write(data);
			System.out.println("data has written");
			fw.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
