import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void expect1_whenPerson1() {
        // GIVEN
        int person = 1;

        // WHEN
        String actual = FizzBuzz.answer(person);

        // THEN
        String expected = "1";
        Assertions.assertEquals(expected, actual);
    }
}
