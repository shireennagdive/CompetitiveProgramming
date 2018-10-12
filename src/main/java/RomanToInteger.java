import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> symbolValues = new HashMap<>();
        int value = 0;
        char firstChar, secondChar = '\0';
        char[] symbols = s.toCharArray();
        symbolValues.put('I', 1);
        symbolValues.put('V', 5);
        symbolValues.put('X', 10);
        symbolValues.put('L', 50);
        symbolValues.put('C', 100);
        symbolValues.put('D', 500);
        symbolValues.put('M', 1000);
        for (int i = 0; i < symbols.length; i++) {
            firstChar = symbols[i];
            if (i != symbols.length - 1) {
                secondChar = symbols[i + 1];
            }
            if (secondChar != '\0' && (symbolValues.get(firstChar) < symbolValues.get(secondChar))) {
                value += symbolValues.get(secondChar) - symbolValues.get(firstChar);
                secondChar = '\0';
                i += 1;

            } else {
                value += symbolValues.get(firstChar);

            }
            return value;
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(romanToInt("MDCXCV"));
    }
}
//1000 + 600 + 90