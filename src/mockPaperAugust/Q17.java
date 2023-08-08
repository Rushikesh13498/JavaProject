package mockPaperAugust;

import java.util.HashMap;
import java.util.Map;

	public class Q17 {
	    public static void main(String[] args) {
	        String mobileNumber = "9145078177";
	        Map<Character, Integer> digitFrequency = new HashMap<>();

	        for (int i = 0; i < mobileNumber.length(); i++) {
	            char digit = mobileNumber.charAt(i);
	            digitFrequency.put(digit, digitFrequency.getOrDefault(digit, 0) + 1);
	        }

	        for (Map.Entry<Character, Integer> entry : digitFrequency.entrySet()) {
	            System.out.println("Digit " + entry.getKey() + ": Frequency " + entry.getValue());
	        }
	    }
	}


