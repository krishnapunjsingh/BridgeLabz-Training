import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddressBook {

    private String name;
    private List<ContactPerson> contacts;

    public AddressBook(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<ContactPerson> getContacts() {
        return contacts;
    }

    // UC: Add Contact with duplicate check
    public boolean addContact(ContactPerson person) {
        if (contacts.contains(person)) {
            return false;   // duplicate
        }
        contacts.add(person);
        return true;
    }

    // UC: Find Contact by First Name
    public ContactPerson findByFirstName(String firstName) {
        for (ContactPerson person : contacts) {
            if (person.getFirstName().equalsIgnoreCase(firstName)) {
                return person;
            }
        }
        return null;
    }

    // UC: Delete Contact safely
    public boolean deleteByFirstName(String firstName) {
        Iterator<ContactPerson> iterator = contacts.iterator();

        while (iterator.hasNext()) {
            ContactPerson person = iterator.next();
            if (person.getFirstName().equalsIgnoreCase(firstName)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
