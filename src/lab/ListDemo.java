package lab;

import java.util.ArrayList;

import com.list.ArraylistStringandInteger;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("html");
		list1.add("java");
		list1.add("python");
		list1.add("CSS");
		list1.add("ruby");

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("html");
		list2.add("CSS");
		list2.add("javascript");
		list2.add("C#");
		list2.add("ruby");
	
		
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		
	ArrayList<String>list3=new ArrayList<>();//same
    ArrayList<String>list4=new ArrayList<>();//diff
	
    System.out.println(list1.retainAll(list2));
	
	for(String s:list1) {
		for(String s1:list2) {
			if(s!=s1) {
				list4.add(s);
			}else {
				list3.add(s);
			}
		}
	}
	System.out.println("list3:"+list3);
	System.out.println("-------------------------------------");
	System.out.println("list4:"+list4);
	
	
	
	
	}

}
