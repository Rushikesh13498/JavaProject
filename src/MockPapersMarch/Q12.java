package MockPapersMarch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q12 {

	

	    public static void main(String[] args) {
	        List<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");

	        Iterator<String> iterator = list.iterator();

	        while (iterator.hasNext()) {
	            String fruit = iterator.next();
	            System.out.println(fruit);
	            list.add("Durian"); 
	        }
	    }
	}




//O/P----------->
//Apple
//Exception in thread "main" java.util.ConcurrentModificationException
//	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
//	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
//	at MockPapersMarch.Q12.main(Q12.java:20)