package exceptionHandling;

import java.io.FileWriter;
import java.io.IOException;

public class CompileTimeExceptiondemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		FileWriter fw=null;
		try {
			fw=new FileWriter("myfile.txt");
			String data="Java is programming language";
			fw.write(data);
			System.out.println("file created.");
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				fw.close();
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
