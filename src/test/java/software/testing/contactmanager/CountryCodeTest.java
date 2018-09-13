package software.testing.contactmanager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Enumerations in Java can be much more sophisticated than
 * this example. For example, there can be methods and
 * data associated with the enum values.
 *
 * If the enum was more complex, unit testing would be
 * appropriate.
 *
 * For the example in this enum, you could
 * decide that it isn't worth writing a test.
 *
 * The example test asserts that there are 5 items in the
 * enum. Arguably, that is not necessary.
 */
class CountryCodeTest {

    @Test
    public void shouldContainFiveItems() {

        assertEquals(5, CountryCode.values().length);
    }

}