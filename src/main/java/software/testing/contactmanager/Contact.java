package software.testing.contactmanager;

import java.util.Scanner;

/**
 * A contact, that has a name, phone number and address.
 *
 * The class implements the interface so that there is support for
 * Collections.sort().
 *
 * @author Lynda Thomas (ltt@aber.ac.uk)
 * @author Chris Loftus (cwl@aber.ac.uk)
 * @author Neil Taylor (nst@aber.ac.uk)
 */
public class Contact implements Comparable<Contact>
{
    /** Contact's address. */
    private Address address;

    /**
     * Gets the address.
     * @return Returns the address.
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the address.
     * @param address The address to set.
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /** The contact's name */
    private String name;

    /** The contact's phone number */
    private String phone;

    /**
     * Creates a new Contact and initialises the name to <i>unknown</i> and the
     * phone number will be <i>null</i>.
     */
    public Contact() {
        this("unknown");
    }

    /**
     * Creates a new contact. The name will be that specified as the
     * parameter and the phone number will be <i>null</i>.
     *
     * @param name The name of the contact.
     */
    public Contact(String name) {
        this(name, null);
    }

    /**
     * Creates a new Contact and sets the name and phone number
     * to the specified values.
     *
     * @param n The contact's name.
     * @param p The contact's phone number.
     */
    public Contact(String n, String p) {
        name = n;
        phone = p;
    }

    /**
     * Gets the name.
     * @return The name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * @param n The name.
     */
    public void setName(String n) {
        name = n;
    }

    /**
     * Sets the phone number.
     * @param phone The phone number.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets the phone number.
     * @return The phone number.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Reads the name and phone number details from the keyboard.
     * The values are assigned to the fields (instance variables).
     */
    public void readKeyboard() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = in.next();
        System.out.print("Enter phone: ");
        phone = in.next();
    }

    /**
     * Checks whether this object is equal to the specified object.
     * The test is based on whether the name in the two objects is
     * the same.
     * <p>
     * An example use of this method is:
     * <p>
     * <pre>
     * Contact c = new Contact("Test");
     * Contact o = new Contact("Other");
     * boolean areEqual = c.equals(o);
     * </pre>
     *
     * @param other The other object to compare.
     *
     * @return True if the objects are equal. Otherwise, false.
     */
    @Override
    public boolean equals(Object other) {

        if(other instanceof Contact) {
            Contact o = (Contact) other;
            return (this.name).equals(o.name);
        }

        return false;
    }

    /**
     * Returns a string representation of this contact, including the
     * name and the phone number. There are two spaces between the
     * name and the phone number.
     *
     * @return A string description.
     */
    @Override
    public String toString() {
        return name + "  " + phone;
    }

    /**
     * Compares two Contacts and determines whether the
     * two are equal, or if one is greater than the other. The
     * comparison is based on the two names in the objects.
     * <p>
     * Example use:
     * <p>
     * <pre>
     * Contact c = new Contact("Test");
     * Contact o = new Contact("Other");
     * int comparedValue = c.compareTo(o);
     * </pre>
     * <p>
     * This method is called when sorting items in a list. It is defined
     * in the Comparable interface. If you look at the definition of this
     * class, you will see <code>implements Comparable&lt;Contact&gt;</code>. This
     * implements statement indicates that this class can compare instances
     * of the Contact class.
     *
     * @param other The other contact to be compared.
     *
     * @return 0 if both objects are the same. 1 if this object is greater than
     * the other object and -1 if this object is less than the other object.
     */
    public int compareTo(Contact other) {
        return (this.name).compareTo(other.name);
    }
}
