public class ContactPerson {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public ContactPerson(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        ContactPerson other = (ContactPerson) obj;
        return firstName.equalsIgnoreCase(other.firstName) && lastName.equalsIgnoreCase(other.lastName);
    }

    public int hashCode(){
        return Object.hash(firstName.toLowerCase(), lastName.toLowerCase());
    }
    public String getFirstName(){
        return firstName;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setState(String state){
        this.state = state;
    }
    public String getCity(){
        return city;
    }
    public void setZip(String zip){
        this.zip = zip;
    }
    public String getState(){
        return state;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    } 
    public void setEmail(String email){
        this.email = eamil;

    }

    public String display(){
        return "Contact person{" +  " firstName" + firstName + " lastName " + lastName + " address " + address + " city " + city + " state " + state + " zip " + zip + " phoneNumber " + phoneNumber + " email " + email + "}";
    }
}
