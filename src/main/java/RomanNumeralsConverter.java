import java.util.HashMap;

public class RomanNumeralsConverter {
    public int convertRomanToArabic(String romanNumber) {
        HashMap<String, Integer> romanNumeralsMap = new HashMap<>();
        romanNumeralsMap.put("I", 1);
        romanNumeralsMap.put("II", 2);
        romanNumeralsMap.put("III", 3);

        return romanNumeralsMap.get(romanNumber);
    }
}
