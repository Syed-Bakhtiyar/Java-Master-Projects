package arrays.arraylists.mobile;

import java.util.Scanner;

public class MobileMain {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        boolean isContinue = true;
        String name;
        String oldName;
        String number;
        while (isContinue){
            printContacts();
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    mobile.printContacts();
                    break;
                case 2:
                    System.out.println("Type the name of a person: ");
                    name = scanner.nextLine();
                    System.out.println("Type the number of a person: ");
                    number = scanner.nextLine();
                    mobile.addContact(name, number);
                    break;
                case 3:
                    System.out.println("Type the name you want to update: ");
                    oldName = scanner.nextLine();
                    System.out.println("Type the new Name: ");
                    name = scanner.nextLine();
                    System.out.println("Type the number: ");
                    number = scanner.nextLine();
                    mobile.updateContact(oldName, name, number);
                    break;
                case 4:
                    System.out.println("Type the name of a person to remove: ");
                    name = scanner.nextLine();
                    mobile.removeContact(name);
                    break;
                case 5:
                    System.out.println("Type the name of a person to find: ");
                    name = scanner.nextLine();
                    Contacts contact = mobile.searchContact(name);
                    if(contact != null){
                        System.out.println(contact.getName());
                        System.out.println(contact.getNumber());
                        System.out.println("---------------------------");
                    } else {
                        System.out.println("Not Found");
                    }
                    break;
                case 6:
                    isContinue = false;
                    break;
            }
            System.out.println("");
        }
    }

    private static void printContacts(){
        System.out.println("1. View the contact: ");
        System.out.println("2. Add the contact: ");
        System.out.println("3. Update an existing contact: ");
        System.out.println("4. Delete the contact: ");
        System.out.println("5. Search in the contact with name: ");
        System.out.println("6. Quit: ");
    }
}
