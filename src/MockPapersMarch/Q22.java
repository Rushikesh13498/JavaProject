package MockPapersMarch;

import java.util.*;
import java.util.Scanner;

public class Q22 {
	
	
	    public static void main(String[] args) {
	        TreeSet<Integer> numberSet = new TreeSet<>();
	        numberSet.add(14);
	        numberSet.add(15);
	        numberSet.add(63);
	        numberSet.add(78);
	        numberSet.add(96);
	        numberSet.add(100);
	        numberSet.add(112);
           
	        
	        int inputNumber =63;
	        Integer result = findNumberTwoLocationsAfter(numberSet, inputNumber);
	        System.out.println("Result: " + result);
	    }

	    public static Integer findNumberTwoLocationsAfter(TreeSet<Integer> set, int number) {
	        if (set.contains(number)) {
	            Iterator<Integer> iterator = set.iterator();
	            while (iterator.hasNext()) {
	                int current = iterator.next();
	                if (current == number) {
	                
	                    if (set.size() - set.headSet(current, false).size() >= 3) {
	                      
	                        iterator.next();
	                        return iterator.next();
	                    } else {
	                      
	                        break;
	                    }
	                }
	            }
	        }
	        return null;
	    }
	}
