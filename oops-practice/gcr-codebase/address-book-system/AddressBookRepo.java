
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressBookRepo {
    private List<ContactPerson> contactList = new ArrayList<>();

    public void save(ContactPerson person){
        contactList.add(person);
    }

    public ContactPerson findByFirstName(String firstName){
        for(ContactPerson person: contactList){
            if(person.getFirstName().equalsIgnoreCase(firstName)){
                return person;
            }
        }
        return null;
    }
    private Map<String, AddressBook> addressBookMap = new HashMap<>();
    public boolean addAddressBook(String name){
        if(addressBookMap.containsKey(name)){
            return false;
        }
        addressBookMap.put(name, new AddressBook(name));
        return true;
    }
    public AddressBook getAddressBook(String name){
        return addressBookMap.gst(name);
    }
    public Map<String, AddressBook> getAllAddressBook(){
        return addressBookMap;
    }
    public boolean deleteByFirstName(String firstName){
        for(int i=0;i<contactList.size();i++){
            if(contactList.get(i).getFirstName().equalsIgnoreCase(firstName)){
                contactList.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<ContactPerson> findAll(){
        return contactList;
    }
}
