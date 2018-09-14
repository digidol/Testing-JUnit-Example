package software.testing.contactmanager;

import java.io.*;
import java.util.*;

/**
 * Holds information about a set of contacts.
 *
 * @author Lynda Thomas (ltt@aber.ac.uk)
 * @author Chris Loftus (cwl@aber.ac.uk)
 * @author Neil Taylor (nst@aber.ac.uk)
 */
public class ContactManager {

    /** List of contacts in the Contact Manager. */
    private ArrayList<Contact> contacts;

    /** Filename for the stored list of contacts. */
    private String fileName;

    /**
     * Creates a Contact Manager and initialises it with an empty list of
     * contacts.
     */
    public ContactManager() {
        contacts = new ArrayList<Contact>(20);
    }

    /**
     * Adds a contact.
     *
     * @param c The contact to be added.
     */
    public void add(Contact c) {
        contacts.add(c);
    }

    /**
     * Displays information about this Contact Manager to the output stream. The
     * output includes the filename and the list of contacts.
     *
     * TODO: We discussed this method in class. Can we test this method? We discussed
     * including a new method, e.g. getInformation(), that builds up a string and
     * returns it. This method can then be used to output that string.
     */
    public void printInformation() {
        System.out.println("My " + fileName + " contacts are:");
        for (Contact c : contacts) {
            System.out.println(c.toString());
        }
    }

    /**
     * Loads the list of contacts from a filename. The method prompts the user
     * for a filename and attempts to load a list of contacts from the file.
     *
     * @throws IOException
     *             if there is a problem reading the file.
     *
     * TODO: Think about how you could test this method. Are there any problems?
     *
     */
    public void load() throws IOException {
        // read from file
        Scanner in = new Scanner(System.in);
        System.out.print("Which file will you be using? ");
        fileName = in.next();
        Scanner infile = new Scanner(new InputStreamReader(new FileInputStream(
                fileName)));
        int num = infile.nextInt();
        for (int i = 0; i < num; i++) {
            String n = infile.next();
            String p = infile.next();
            Contact c = new Contact(n, p);
            contacts.add(c);
        }
        infile.close();
    }

    /**
     * Saves the details to a file.
     *
     * @throws IOException
     *             if there is an error writing the details to file.
     *
     * TODO: Think about how you could test this method. Are there any problems?
     *
     */
    public void save() throws IOException {

        PrintWriter outfile = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream(fileName)));

        outfile.println(contacts.size());
        for (Contact c : contacts) {
            outfile.println(c.getName());
            outfile.println(c.getPhone());
        }

        outfile.close();
    }

    public int getNumberOfContacts() {
        return contacts.size();
    }

    /**
     * Finds a contact that matches the specified contact.
     *
     * @param who
     *            The specified contact that contains the name that is to
     *            located in the list.
     *
     * @return The contact, if found or the value <code>null</code> if no match
     *         was found.
     *
     * @throws IllegalArgumentException if the contact parameter is null.
     */
    public Contact find(Contact who) {

        if(who == null) {
            throw new IllegalArgumentException("Contact must not be null");
        }

        for (Contact c : contacts) {
            if (c.equals(who)) {
                return c;
            }
        }

        return null;
    }

    /**
     * Finds a contact that matches the name. This creates a contact
     * and then calls find(Contact).
     *
     * @param name The name to search for.
     *
     * @return If the contact is found, it is returned. Otherwise, null is returned.
     */
    public Contact find(String name) {
        return find(new Contact(name));
    }

    /**
     * Sorts the list of contacts so that they are in alphabetic order based on
     * the name of the contact.
     */
    public void sort() {
        Collections.sort(contacts);
    }

}
