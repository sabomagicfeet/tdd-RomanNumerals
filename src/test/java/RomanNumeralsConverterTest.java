import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RomanNumeralsConverterTest {

    @ParameterizedTest
    @CsvSource({
            "I, 1",
            "II, 2",
            "III, 3"
    })
    void convertRomanNumberToArabicNumberTest(String romanNumbers, int arabicNumbers) {
        // Arrange
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

        // Act
        int actual = romanNumeralsConverter.convertRomanToArabic(romanNumbers);

        // Assert
        Assertions.assertEquals(arabicNumbers, actual);

    }
}
