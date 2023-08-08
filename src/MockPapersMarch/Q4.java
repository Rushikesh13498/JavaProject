package MockPapersMarch;

public class Q4 {

	    public static void main(String[] args) {
	        String input = "Help others";
	        String reversed = reverseStringPreservingSpaces(input);
	        System.out.println(reversed);
	    }

	    public static String reverseStringPreservingSpaces(String input) {
	        char[] charArray = input.toCharArray();
	        int left = 0;
	        int right = charArray.length - 1;

	        while (left < right) {
	            if (charArray[left] == ' ') {
	                left++;
	            } else if (charArray[right] == ' ') {
	                right--;
	            } else {
	                char temp = charArray[left];
	                charArray[left] = charArray[right];
	                charArray[right] = temp;
	                left++;
	                right--;
	            }
	        }

	        return new String(charArray);
	    }
	}

