package lab;
import java.util.*;
public class Student11 {
	

		int id;
   	String name;
		int marks;

		public Student11() {
			super();
			this.id = id;
			this.name = name;
			this.marks = marks;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
		}

		public static void acceptMarks(int marks) {
			/*
			 * int arr[]=new int[1]; System.out.println(arr[1]);
			 *///because of arrayindexoutofboundexception main catch block gets terminated explicitly
			try {
				if (marks > 0 && marks < 100) {
					System.out.println("thank you for input!!!!");
				} else {
					throw new ArithmeticException("Please enter valid marks (i.e grater than 0 and less than 100)");

				}
			}catch(ArithmeticException e){
				System.out.println("Message"+e.getMessage());
				
			}
			finally {
	              System.out.println("........");//finally block always works with or without exception
			}

		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Student11 s = new Student11();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Student Details");
			System.out.println("........................");
			System.out.println("Enter id: ");
			int id = sc.nextInt();
			System.out.println("Enter name:");
			String name = sc.next();
			System.out.println("Enter marks:");
			int marks = sc.nextInt();
			try {
				s.acceptMarks(marks);
				System.out.println("Marks");//if s.acceptmarks method is run sopln will be printed 
			} catch (ArithmeticException e) {
				System.out.println("Message -->" + e.getMessage());
			}
		}

	}



