package software.testing.contactmanager;

import java.io.*;
import java.util.*;

/**
 * Manages a list of contacts and presents a menu to allow the user to query and
 * update the list of contacts.
 *
 * @author Lynda Thomas (ltt@aber.ac.uk)
 * @author Chris Loftus (cwl@aber.ac.uk)
 * @author Neil Taylor (nst@aber.ac.uk)
 */
public class ContactManagerApplication {

    /** The contact manager */
    private ContactManager contactManager;

    /** Reads keyboard input */
    private Scanner in;

    /**
     * Instantiates a new ContactManagerApplication and attempts to load
     * information from a file.
     *
     * @throws IOException
     *             if there is an error loading the information.
     */
    public ContactManagerApplication() throws IOException {
        System.out.println("*** Welcome to Contact Manager Application **");
        contactManager = new ContactManager();
        contactManager.load();
        in = new Scanner(System.in);
    }

    /**
     * Controls the operations once the application has started. A menu is
     * displayed and the user is prompted to select an option. Once an option
     * has been selected, the appropriate action is activated.
     *
     * @throws IOException
     */
    public void runApp() throws IOException {
        char ch;
        do {
            this.printMenu();
            String choice = in.next();
            ch = choice.charAt(0);
            switch (ch) {
                case 'C':
                case 'c':
                    contactManager = new ContactManager();
                    System.out.println("** created brand new contact manager");
                    break;
                case 'L':
                case 'l':
                    contactManager.load();
                    break;
                case 'N':
                case 'n':
                    Contact c = new Contact();
                    c.readKeyboard();
                    contactManager.add(c);
                    System.out.println("** added contact");
                    break;
                case 'P':
                case 'p':
                    contactManager.printInformation();
                    break;
                case 'F':
                case 'f':
                    this.find(); // moved code into method for prettiness
                    break;
                case 'D':
                case 'd':
                    contactManager.sort();
                    break;
                case 'Q':
                case 'q':
                    System.out.println("saving contacts in file");
                    contactManager.save();
                    break;
                default:
                    System.out.println("That is not a choice!");
            }

        } while ((ch != 'Q') & (ch != 'q'));
    }

    /**
     * Displays the menu for the application.
     */
    public void printMenu() {
        System.out.println("\n\n\n *** MENU ***");
        System.out.println("Enter first letters to pick a function:");
        System.out
                .println("'C' to create a brand new Contact Manager - will lose old one");
        System.out.println("'L' to load a file of contacts");
        System.out.println("'N' to create a New Contact and add");
        System.out.println("'P' to print out all of the contacts");
        System.out.println("'F' to find someone's phone");
        System.out.println("'D' to sort on name");
        System.out.println("-- could also sort, remove, change");
        System.out.println("'Q' to quit ");
        System.out.print("Type here: ");
    }

    /**
     *
     */
    public void find() {

        System.out.print("Who do you want to find? ");
        String name = in.next();
        Contact found = contactManager.find(name);
        if (found == null) {
            System.out.println("cannot find");
        } else {
            System.out.println("phone number is " + found.getPhone());
        }
    }

    /**
     * Runs the application.
     *
     * @param args
     *            A list of command line arguments.
     *
     * @throws IOException
     *             if there is an error processing a file in the application.
     */
    public static void main(String args[]) throws IOException {
        ContactManagerApplication app = new ContactManagerApplication();
        app.runApp();
        System.out.println("end of program");
    }
}