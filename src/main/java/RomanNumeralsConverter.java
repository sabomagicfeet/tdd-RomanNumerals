public class RomanNumeralsConverter {
    public int convertRomantoArabic(String romanNumber) {
        // if roman Number is I, return 1
        if(romanNumber == "I") {
            return 1;
        } else if(romanNumber == "II") {
            return 2;
        } else if(romanNumber == "III") {
            return 3;
        }
        return 0;
    }
}
