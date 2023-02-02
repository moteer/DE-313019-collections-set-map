package de.brightslearning.collections.phonebook;

import java.util.*;

/**
 * # Exercise Set Map
 * <p>
 * 1. Implement a phonebook which stores contacts.
 * 2. The phonebook should provide the following methods for the user
 * - public void add(String firstName, String lastName, ...) to add a new contact to the phonebook
 * - public Contact get(String firstName, String lastName) to retrieve a Contact from the phonebook
 * - public Contact remove(String firstName, String lastName) to delete contact from the phonebook, returns the deleted contact
 * - Bonus: public Contact getByNumber(String phoneNo) to retrieve a contact by its number
 * <p>
 * - Hint: a map for the phonebook: key = firstname + lastname, value = Contact-object
 * <p>
 * 3. public void printContactsSortedByFirstname();
 * 4. The toString method should print the phonebook in order of entrance
 * 5. Implement a class PairGenerator that generates random pairs of contacts. The PariGenerator should be able to be used with students too, so that we can generate random study buddies
 * - public Set<Team> getTeam() // should return a set of teams with 2 people in each team
 * - make use of the PairGenerator with Another Type like e.g. Student(name, lastname, matricleNumber, mainSubject)
 */
public class PhoneBook {

    private final Map<String, Contact> phoneBook = new LinkedHashMap<>();

    public void add(String firstName, String lastName, String phoneNumber) {
        phoneBook.put(firstName + lastName, new Contact(firstName, lastName, phoneNumber));
    }

    public Contact get(String firstName, String lastName) {
        return phoneBook.get(firstName + lastName);
    }

    public Contact remove(String firstName, String lastName) {
        return phoneBook.remove(firstName + lastName);
    }

    public Contact getByNumber(String phoneNumber) {
        for (Map.Entry<String, Contact> phoneBookEntry : phoneBook.entrySet()) {
            Contact contact = phoneBookEntry.getValue();
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact;
            }
        }
        return null;
    }

    public String printContactsSortedByFirstname() {
        TreeMap<String, Contact> sortedPhoneNumber = new TreeMap<>(new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        sortedPhoneNumber.putAll(phoneBook);
        return prettyPrintMap(sortedPhoneNumber);
    }

    @Override
    public String toString() {
        return prettyPrintMap(this.phoneBook);
    }

    private String prettyPrintMap(Map<String, Contact> phoneBook) {
        StringBuilder sb = new StringBuilder("PhoneBook\n");
        for (Map.Entry<String, Contact> stringContactEntry : phoneBook.entrySet()) {
            sb.append(stringContactEntry.getValue().getFirstName());
            sb.append(":\n\t");
            sb.append(stringContactEntry.getValue());
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Rene", "Martinek", "987654373");
        phoneBook.add("Alina", "Wiehagen", "0987654321");
        phoneBook.add("Christian", "Lange", "1234567890");
        phoneBook.add("Erik", "Hölzel", "5454545454");

        System.out.println(phoneBook.printContactsSortedByFirstname());
        System.out.println(phoneBook);

    }
}
