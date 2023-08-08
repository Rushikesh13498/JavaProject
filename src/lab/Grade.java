package lab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Grade {

	public static void main(String[] args) {
		Student s=new Student();
		
		ArrayList<Student> s1=s.showList();//200
		
		Iterator<Student> it=s1.iterator();
		
		while(it.hasNext())
		{
			Student st=it.next();
			int sum=0;
			System.out.println(st.id+""+st.name+"");
			List<Integer> li=st.marks;
			for(Integer i:li)
			{
				sum=sum+i;
			}
			System.out.println("per is.."+sum/li.size());
		}
	}

}
