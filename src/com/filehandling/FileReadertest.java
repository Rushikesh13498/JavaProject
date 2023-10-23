package com.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader fr=new FileReader("myd.txt");
			int i=fr.read();
			while(i!=-1) {
				System.out.println((char)i);
				i=fr.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
