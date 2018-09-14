package software.testing.contactmanager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Some example tests. There could be more tests for each of the fields
 * in the class. You could complete those.
 */
class AddressTest {

    @Test
    public void shouldContainNullValuesWhenFirstCreated() {

        // Arrange
        Address address = new Address();

        // Act

        // Assert
        assertNull(address.getHouseNameNum());
        assertNull(address.getStreetName());
        assertNull(address.getTown());
        assertNull(address.getCountry());
        assertNull(address.getPostZipCode());
    }

    @Test
    public void shouldSetAndGetTown() {

        // Arrange
        Address address = new Address();

        // Act
        address.setTown("Shenyang");

        // Assert
        assertEquals("Shenyang", address.getTown());

    }

    @Test
    public void shouldSetAndGetStreetName() {

        // Arrange
        Address address = new Address();

        // Act
        address.setStreetName("Middle");

        // Assert
        assertEquals("Middle", address.getStreetName());
    }



}