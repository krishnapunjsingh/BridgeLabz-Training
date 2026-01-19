public class AddressBookService {

    private AddressBookRepo repo = new AddressBookRepo();

    // UC: Create Address Book
    public void createAddressBook(String name) {
        boolean created = repo.addAddressBook(name);
        if (created) {
            System.out.println("Address Book created successfully");
        } else {
            System.out.println("Address Book already exists");
        }
    }

    // UC: Add Contact to specific Address Book (with duplicate check inside)
    public void addContact(String bookName, ContactPerson person) {
        AddressBook book = repo.getAddressBook(bookName);

        if (book == null) {
            System.out.println("Address Book not found");
            return;
        }

        boolean added = book.addContact(person);
        if (added) {
            System.out.println("Contact added to " + bookName);
        } else {
            System.out.println("Duplicate contact not allowed");
        }
    }

    // UC: Edit Contact in specific Address Book
    public void editContact(String bookName, String firstName,
                            String newCity, String newPhone) {

        AddressBook book = repo.getAddressBook(bookName);
        if (book == null) {
            System.out.println("Address Book not found");
            return;
        }

        ContactPerson person = book.findByFirstName(firstName);
        if (person != null) {
            person.setCity(newCity);
            person.setPhoneNumber(newPhone);
            System.out.println("Contact updated successfully");
        } else {
            System.out.println("Contact not found");
        }
    }

    // UC: Delete Contact
    public void deleteContact(String bookName, String firstName) {
        AddressBook book = repo.getAddressBook(bookName);
        if (book == null) {
            System.out.println("Address Book not found");
            return;
        }

        boolean isDeleted = book.deleteByFirstName(firstName);
        if (isDeleted) {
            System.out.println("Contact deleted successfully");
        } else {
            System.out.println("Contact not found");
        }
    }

    // UC: Display Contacts of a specific Address Book
    public void displayContacts(String bookName) {
        AddressBook book = repo.getAddressBook(bookName);
        if (book != null) {
            book.getContacts().forEach(System.out::println);
        } else {
            System.out.println("Address Book not found");
        }
    }

    // UC: Display all Address Books
    public void displayAddressBooks() {
        repo.getAllAddressBook().keySet().forEach(System.out::println);
    }
    public void searchPersonByCity(String city){
        boolean found = false;
        for(AddressBook book: repo.getAllAddressBook().values()){
            for(ContactPerson person: book.getContacts()){
                if(person.getCity().equalsIgnoreCase(city)){
                    System.out.println(person + " AddressBook: " + book.getName());
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No person found in city: " + city);
        }
    }
    public void searchPersonByState(String state) {
        boolean found = false;
    
        for (AddressBook book : repo.getAllAddressBook().values()) {
            for (ContactPerson person : book.getContacts()) {
                if (person.getState().equalsIgnoreCase(state)) {
                    System.out.println(person + " | AddressBook: " + book.getName());
                    found = true;
                }
            }
        }
    
        if (!found) {
            System.out.println("No person found in state: " + state);
        }
    }
    public void 

}
