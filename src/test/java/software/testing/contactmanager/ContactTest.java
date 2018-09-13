package software.testing.contactmanager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    private Contact commonContact = null;

    @BeforeEach
    public void setup() {
        commonContact = new Contact();
    }

    @Test
    public void shouldCreateContactWithNoDetails() {
        assertEquals("unknown", commonContact.getName());
        assertNull(commonContact.getPhone());
    }

    @Test
    public void shouldBeAbleToAddAddress() {
        Contact contact = new Contact("Ada");
        Address address = new Address();

        contact.setAddress(address);

        assertEquals(address, contact.getAddress());
    }

    @Test
    public void testEqualsWithStringParameter() {

        Contact thomas = new Contact("thomas");
        assertFalse(thomas.equals("thomas"));
    }

    @Test
    public void testEqualsWithThomasContact() {

        Contact thomas = new Contact("thomas");
        Contact otherThomas = new Contact("thomas");

        assertTrue(thomas.equals(otherThomas));

    }

    @Test
    public void testEqualsWithKelseyContact() {

        Contact thomas = new Contact("thomas");
        Contact kelsey = new Contact("kelsey");

        assertFalse(thomas.equals(kelsey));

    }

    //@Test
    public void testReadKeyboard() {
        Contact contact = new Contact();
        contact.readKeyboard();
        assertEquals("Neil", contact.getName());
        assertEquals("1528", contact.getPhone());
    }


}