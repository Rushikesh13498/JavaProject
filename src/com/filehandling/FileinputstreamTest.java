package com.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileinputstreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fin=null;
		
		try {
			fin=new FileInputStream("myfile.txt");
			int i=fin.read();
			while(i!=-1) {
				System.out.print((char)i);
				i=fin.read();
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace(); 
		}
		
	}
	

}
