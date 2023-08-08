package MockPapersMarch;

import java.util.*;

public class Q20 {

    public static void main(String[] args) {
        LinkedList<Integer> numberList = new LinkedList<>();
        numberList.add(1);
        numberList.add(4);
        numberList.add(2);
        numberList.add(1);
        numberList.add(3);
        numberList.add(1);
        numberList.add(4);

        Map<String, Integer> numberMap = countOccurrences(numberList);

      
        for (Map.Entry<String, Integer> entry : numberMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> countOccurrences(LinkedList<Integer> list) {
        Map<String, Integer> numberMap = new HashMap<>();

        for (int number : list) {
            String numberInWords = convertToWord(number);

        
            numberMap.put(numberInWords, numberMap.getOrDefault(numberInWords, 0) + 1);
        }

        return numberMap;
    }

    public static String convertToWord(int number) {
        String numberInWords;
        switch (number) {
            case 1:
                numberInWords = "one";
                break;
            case 2:
                numberInWords = "two";
                break;
            case 3:
                numberInWords = "three";
                break;
            case 4:
                numberInWords = "four";
                break;
            case 5:
                numberInWords = "five";
                break;
            default:
                numberInWords = "unknown";
        }
        return numberInWords;
    }
}


