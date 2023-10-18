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

    @Test
    void expect2_whenPerson2() {
        // GIVEN
        int person = 2;

        // WHEN
        String actual = FizzBuzz.answer(person);

        // THEN
        String expected = "2";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expectFizz_whenPerson3() {
        // GIVEN
        int person = 3;

        // WHEN
        String actual = FizzBuzz.answer(person);

        // THEN
        String expected = "Fizz";
        Assertions.assertEquals(expected, actual);
    }
}
