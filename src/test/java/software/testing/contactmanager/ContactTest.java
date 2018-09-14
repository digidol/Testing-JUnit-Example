package software.testing.contactmanager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class includes some System.out.println() statements. This is to show
 * when the setup() method is called. They are not necessary (and should not be
 * used) in real unit tests.
 */
class ContactTest {

    private Contact commonContact = null;

    @BeforeEach
    public void setup() {
        System.out.println("Running the setup...");
        commonContact = new Contact();
    }

    @Test
    public void shouldCreateContactWithNoDetails() {
        System.out.println("Running the shouldCreateContactWithNoDetails...");
        assertEquals("unknown", commonContact.getName());
        assertNull(commonContact.getPhone());
    }

    @Test
    public void shouldBeAbleToAddAddress() {
        System.out.println("Running the shouldBeAbleToAddAddress...");
        Contact contact = new Contact("Ada");
        Address address = new Address();

        contact.setAddress(address);

        assertEquals(address, contact.getAddress());
    }

    @Test
    public void testEqualsWithStringParameter() {
        System.out.println("Running the testEqualsWithStringParameter...");

        Contact thomas = new Contact("thomas");
        assertFalse(thomas.equals("thomas"));
    }

    @Test
    public void testEqualsWithThomasContact() {

        System.out.println("Running the testEqualsWithThomasContact...");

        Contact thomas = new Contact("thomas");
        Contact otherThomas = new Contact("thomas");

        assertTrue(thomas.equals(otherThomas));

    }

    @Test
    public void testEqualsWithKelseyContact() {

        System.out.println("Running the testEqualsWithKelseyContact...");

        Contact thomas = new Contact("thomas");
        Contact kelsey = new Contact("kelsey");

        assertFalse(thomas.equals(kelsey));

    }

    /*
    @Test
    public void testReadKeyboard() {

        System.out.println("Running the testEqualsWithKelseyContact...");
        Contact contact = new Contact();
        contact.readKeyboard();
        assertEquals("Neil", contact.getName());
        assertEquals("1528", contact.getPhone());
    }
    */

}