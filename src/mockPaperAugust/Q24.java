package mockPaperAugust;

import java.util.HashMap;
import java.util.Map;

public class Q24 {
	
	    public static void main(String[] args) {
	        
	        Map<String, String> voteMap = new HashMap<>();
	        voteMap.put("1234567890", "BJP");
	        voteMap.put("9876543210", "ShivSena");
	        voteMap.put("4567890123", "NCP");
	        voteMap.put("6543210987", "Congress");
	        voteMap.put("7890123456", "BJP");
	        voteMap.put("3210987654", "ShivSena");
	        voteMap.put("8901234567", "Congress");
	        voteMap.put("5678901234", "NCP");
	        voteMap.put("4321098765", "Other");

	        
	        Map<String, Integer> voteCountMap = new HashMap<>();

	        for (String party : voteMap.values()) {
	            voteCountMap.put(party, voteCountMap.getOrDefault(party, 0) + 1);
	        }

	        for (Map.Entry<String, Integer> entry : voteCountMap.entrySet()) {
	            System.out.println("Party: " + entry.getKey() + ", Votes: " + entry.getValue());
	        }
	    }
	}


