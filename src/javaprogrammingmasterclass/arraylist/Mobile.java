package javaprogrammingmasterclass.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mobile {

    private List<Contact> contactList;


    public Mobile() {
        this.contactList = new ArrayList<>();
        Menu();
    }

    public void addContact(String contactName, String contactNumber) {

        contactList.add(Contact.addContact(contactName, contactNumber));
    }

    public void updateContact(String contactName) {
        if (parseContactList(contactName) == null) {
            System.out.println("Contact not found!");

        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter new name or leave blank if the name is the same:");
            String newContactName = scanner.nextLine();
            //    scanner.close();

//        scanner.nextLine();
            if (newContactName.isEmpty()) {
                newContactName = contactName;
            }

            System.out.println("Enter new phone number:");
            String newContactNumber = scanner.next();
            scanner.nextLine();
            Contact contact = new Contact(newContactName, newContactNumber);

            contactList.set(contactList.indexOf(parseContactList(contactName)),
                    contact);

        }
    }

    public void removeContact(String contactName) {
        if (parseContactList(contactName) != null) {
            contactList.remove(parseContactList(contactName));
        } else
            System.out.println("Contact not found!");

    }


    private Contact parseContactList(String contactName) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getName().equals(contactName))
                return contactList.get(i);
        }
        return null;
    }

    private void Menu() {
        boolean quit = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to your phone, " +
                "please press a number to perform an action:\n" +
                "1: add contact\n" +
                "2: update contact\n" +
                "3: delete contact\n" +
                "4: show contacts\n" +
                "5: quit");
        int action = scanner.nextInt();
        while (!quit) {

            switch (action) {
                case 1:
                    System.out.println("Enter name:");
                    String name = scanner.next();
                    scanner.nextLine();

                    System.out.println("Enter number:");
                    String number = scanner.next();
                    scanner.nextLine();

                    addContact(name, number);
                    break;
                case 2:
                    System.out.println("Enter name of contact to update:");
                    name = scanner.next();
                    scanner.nextLine();
                    updateContact(name);
                    break;
                case 3:
                    System.out.println("Enter name of contact to remove:");
                    name = scanner.next();
                    scanner.nextLine();
                    removeContact(name);
                    break;
                case 4:
                    System.out.println(contactList);
                    break;
                case 5:
                    quit = true;
                    break;
            }

            System.out.println("Press button for action: ");
            action = scanner.nextInt();
        }
    }

    public Contact getContact(String name) {
        return null;
    }

    public List getContactList() {
        return this.contactList;
    }

    @Override
    public String toString() {
        return "Your contactList: " + contactList;
    }
}

