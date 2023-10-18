import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTest {

    @ParameterizedTest
    @CsvSource(
            delimiter = '=',
            value = {
                    "1=1",
                    "2=2",
                    "3=Fizz",
                    "4=4",
                    "5=Buzz",
                    "15=Fizz Buzz"
            }
    )
    void testAnswer(int person, String expected) {
        String actual = FizzBuzz.answer(person);
        Assertions.assertEquals(expected, actual);
    }
}
