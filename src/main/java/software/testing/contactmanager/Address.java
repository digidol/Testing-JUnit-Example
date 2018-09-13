package software.testing.contactmanager;

/**
 * The Address class represents information about the contact's address.
 *
 * @author Lynda Thomas (ltt@aber.ac.uk)
 * @author Chris Loftus (cwl@aber.ac.uk)
 * @author Neil Taylor (nst@aber.ac.uk)
 *
 */
public class Address {

    /** The House number or house name */
    private String houseNameNum;

    /** The street name */
    private String streetName;

    /** The town or city name */
    private String town;

    /** The country, represented as a country code */
    private CountryCode country;

    /** The Postcode / Zip code */
    private String postZipCode;

    /**
     * Gets the house number or name.
     * @return The number or name, expressed as a string.
     */
    public String getHouseNameNum() {
        return houseNameNum;
    }

    /**
     * Sets the house number or name to the specified value.
     * @param houseNameNum The house number or name.
     */
    public void setHouseNameNum(String houseNameNum) {
        this.houseNameNum = houseNameNum;
    }

    /**
     * Gets the street name.
     *
     * @return Street name.
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the street name.
     * @param streetName The street name.
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * Gets the town or city name.
     * @return The name.
     */
    public String getTown() {
        // shhh, an example of a simple error
        return town;
    }

    /**
     * Sets the town or city name.
     * @param town The name.
     */
    public void setTown(String town) {
        this.town = town;
    }

    /**
     * Gets the country code for this address.
     * @return The country code.
     */
    public CountryCode getCountry() {
        return country;
    }

    /**
     * Sets the country code for this address.
     * @param country The country code.
     */
    public void setCountry(CountryCode country) {
        this.country = country;
    }

    /**
     * Gets the postcode/zipcode for this address.
     * @return The postcode/zipcode.
     */
    public String getPostZipCode() {
        return postZipCode;
    }

    /**
     * Sets the postcode/zipcode.
     * @param postZipCode The postcode/zipcode.
     */
    public void setPostZipCode(String postZipCode) {
        this.postZipCode = postZipCode;
    }

}
