package MockPapersMarch;


	import java.util.HashMap;
	import java.util.Map;

	public class Q9 {
	    public static void main(String[] args) {
	        String input = "Nothing is as easy as it looks Nothing";
	        Map<String, Integer> wordFrequency = new HashMap<>();

	        String[] words = input.split(" ");

	        for (String word : words) {
	            if (wordFrequency.containsKey(word)) {
	                wordFrequency.put(word, wordFrequency.get(word) + 1);
	            } else {
	                wordFrequency.put(word, 1);
	            }
	        }

	        System.out.println(wordFrequency);
	    }
	}

