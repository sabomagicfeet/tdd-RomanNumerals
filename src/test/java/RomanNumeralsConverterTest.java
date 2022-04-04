import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralsConverterTest {

    // convert I to 1
    @Test
    void convertRomanNumberToArabicNumberTest() {
        // Arrange
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        int expected = 2;
        String romanNumber = "II";

        // Act
        int actual = romanNumeralsConverter.convertRomantoArabic(romanNumber);

        // Assert
        Assertions.assertEquals(expected, actual);

    }
}
