import java.util.ArrayList;

public class PhoneContactOrganizer {

    static class InvalidPhoneNumberException extends Exception {
        InvalidPhoneNumberException(String msg) {
            super(msg);
        }
    }
    static class Contact {
        String name;
        String phone;

        Contact(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }
    ArrayList<Contact> contactList = new ArrayList<>();
    void addContact(String name, String phone)
            throws InvalidPhoneNumberException {
        if (phone.length() != 10) {
            throw new InvalidPhoneNumberException(
                "Phone number must be 10 digits"
            );
        }
        for (Contact c : contactList) {
            if (c.phone.equals(phone)) {
                System.out.println("Contact already exists");
                return;
            }
        }
        contactList.add(new Contact(name, phone));
        System.out.println("Contact added");
    }
    void deleteContact(String phone) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).phone.equals(phone)) {
                contactList.remove(i);
                System.out.println("Contact deleted");
                return;
            }
        }
        System.out.println("Contact not found");
    }

    void searchContact(String value) {
        for (Contact c : contactList) {
            if (c.name.equalsIgnoreCase(value) || c.phone.equals(value)) {
                System.out.println("Name: " + c.name + ", Phone: " + c.phone);
                return;
            }
        }
        System.out.println("Contact not found");
    }

    public static void main(String[] args) {

        PhoneContactOrganizer obj = new PhoneContactOrganizer();

        try {
            obj.addContact("Krishna", "9876543210");
            obj.addContact("Amit", "9123456789");
            obj.addContact("Test", "9876543210");
            obj.addContact("Wrong", "1234");
        } catch (InvalidPhoneNumberException e) {
            System.out.println(e.getMessage());
        }

        obj.searchContact("Krishna");
        obj.deleteContact("9123456789");
        obj.searchContact("9123456789");
    }
}
