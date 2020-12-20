package javaprogrammingmasterclass.arraylist;

import java.util.ArrayList;

public class MobilePhone {
    // write code here
    private String myNumber;
    private ArrayList <Contact> myContacts;


    public MobilePhone(String number){
        this.myNumber = number;
        this.myContacts = new ArrayList <Contact> ();
    }

    public boolean addNewContact (Contact contact) {
        boolean contactCheck = true;

        if(findContact(contact) == -1){
            myContacts.add(contact);
            return contactCheck;
        } else {
            contactCheck = false;
        }

        return contactCheck;
    }


    public boolean updateContact(Contact oldContact, Contact newContact){

        boolean isUpdated = false;
        for(int i = 0; i < myContacts.size(); i++){
            if (myContacts.get(i).getName() == oldContact.getName()){
                myContacts.set(i, newContact);
                isUpdated = true;
            }

        }
        return isUpdated;
    }

    public boolean removeContact(Contact contact) {
        boolean isRemoved = false;
        for(int i = 0; i < myContacts.size(); i++){
            if (myContacts.get(i).getName() == contact.getName()){
                myContacts.remove(i);
                isRemoved = true;
            } else {
                break;
            }
        }
        return isRemoved;
    }
    private int findContact(Contact contact){
        int indexIfPresent = -1;
        for(int i = 0; i < myContacts.size(); i++){
            if(myContacts.get(i).getName() == contact.getName() && myContacts.get(i).getPhoneNumber() == contact.getPhoneNumber()){
                indexIfPresent = i;
            } else {
                break;
            }

        }
        return indexIfPresent;
    }

    private int findContact(String contactName){
        int indexIfPresent = -1;
        for(int i = 0; i < myContacts.size(); i++){
            if(contactName.equals(myContacts.get(i).getName())){
                indexIfPresent = i;
            } else {
                break;
            }

        }
        return indexIfPresent;
    }

    public Contact queryContact(String contactName){

        if(findContact(contactName) != -1){
            for(int i = 0; i < myContacts.size(); i++){
                if(contactName.equals(myContacts.get(i).getName())){
                    return myContacts.get(i);
                }
            }

        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(int i = 0; i < myContacts.size(); i++){
            System.out.println(i+1 + " " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
