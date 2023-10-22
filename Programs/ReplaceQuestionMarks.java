import java.util.ArrayList;
import java.util.List;

public class ReplaceQuestionMarks {

    public static void main(String[] args) {
        String inputString = "10110?01?010?110?110?0";
        List<String> resultStrings = replaceQuestionMarks(inputString);

        // Print all possible strings
        for (String resultString : resultStrings) {
            System.out.println(resultString);
        }
    }

    public static List<String> replaceQuestionMarks(String input) {
        List<String> resultStrings = new ArrayList<>();
        char[] inputChars = input.toCharArray();

        // Find all question marks and their indices
        List<Integer> questionMarkIndices = new ArrayList<>();
        for (int i = 0; i < inputChars.length; i++) {
            if (inputChars[i] == '?') {
                questionMarkIndices.add(i);
            }
        }

        // Generate all possible binary combinations for the number of question marks
        int numQuestionMarks = questionMarkIndices.size();
        int numCombinations = (int) Math.pow(2, numQuestionMarks);

        for (int i = 0; i < numCombinations; i++) {
            StringBuilder result = new StringBuilder(input);
            String binaryString = Integer.toBinaryString(i);

            // Pad binaryString with leading zeros to match the number of question marks
            while (binaryString.length() < numQuestionMarks) {
                binaryString = "0" + binaryString;
            }

            // Replace question marks with binary values
            for (int j = 0; j < numQuestionMarks; j++) {
                int index = questionMarkIndices.get(j);
                char binaryValue = binaryString.charAt(j);
                result.setCharAt(index, binaryValue);
            }

            resultStrings.add(result.toString());
        }

        return resultStrings;
    }
}
