package javaprogrammingmasterclass.arraylist;

public class Contact {
    private String name;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Contact(String contactName, String phoneNumber) {
        this.name = contactName;
        this.phoneNumber = phoneNumber;
    }

    public static Contact addContact(String contactName, String contactNumber) {
        return new Contact(contactName, contactNumber);

    }

    @Override
    public String toString() {
        return "Contact Name: " + name +
                        ", Contact Number: " + phoneNumber +  "\n";
    }
}
