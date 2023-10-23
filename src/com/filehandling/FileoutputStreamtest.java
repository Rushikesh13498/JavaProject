package com.filehandling;
import java.io.*;
//byte stream
//byte stream classes are used to read bytes from inut and 
//write byte to output stream
//eg char,audio,video,images
//java.io
//inputstream and outputstream


public class FileoutputStreamtest {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("data.txt");
			String data="welcome to java eclipse IDE....!!!!!";
			byte arr[]=data.getBytes();
			fos.write(arr);
			System.out.println("file has created");
			fos.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
