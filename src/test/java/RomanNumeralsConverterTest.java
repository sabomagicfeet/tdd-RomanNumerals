import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class RomanNumeralsConverterTest {

    @ParameterizedTest
    @ValueSource(strings = {"I"})
    void convertRomanNumberToArabicNumberTest(String romanNumbers) {
        // Arrange
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        int expected = 1;

        // Act
        System.out.println(romanNumbers);
        int actual = romanNumeralsConverter.convertRomanToArabic(romanNumbers);

        // Assert
        Assertions.assertEquals(expected, actual);

    }
}
