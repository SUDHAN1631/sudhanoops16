import java.util.*;

class contact{
    String name;
    String phoneNumber;

    Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return name + " : " + phoneNumber;
    }
}

class contact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> contacts = new ArrayList<>();
        int ch;

        do {
            System.out.println("\n1. Add  2. View  3. Search  4. Delete  5. Exit  6. Update");
            System.out.print("Choose an option: ");
            ch = sc.nextInt();
            sc.nextLine();  // clear newline

            if (ch == 1) {
                // Add contact
                System.out.print("Enter name to add: ");
                String name = sc.nextLine();
                System.out.print("Enter phone number: ");
                String phone = sc.nextLine();
                contacts.add(new Contact(name, phone));
                System.out.println("Contact added.");
            } 
            else if (ch == 2) {
                // View all contacts
                if (contacts.isEmpty()) {
                    System.out.println("No contacts found.");
                } else {
                    System.out.println("Contacts:");
                    for (Contact c : contacts) {
                        System.out.println(c);
                    }
                }
            } 
            else if (ch == 3) {
                // Search contact by name
                System.out.print("Enter name to search: ");
                String name = sc.nextLine();
                boolean found = false;
                for (Contact c : contacts) {
                    if (c.name.equalsIgnoreCase(name)) {
                        System.out.println("Found: " + c);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Contact not found.");
                }
            } 
            else if (ch == 4) {
                // Delete contact by name
                System.out.print("Enter name to delete: ");
                String nameToDelete = sc.nextLine();
                boolean removed = contacts.removeIf(c -> c.name.equalsIgnoreCase(nameToDelete));
                if (removed) {
                    System.out.println("Contact deleted.");
                } else {
                    System.out.println("Contact not found.");
                }
            } 
            else if (ch == 6) {
                // Update contact by name
                System.out.print("Enter name to update: ");
                String oldName = sc.nextLine();
                boolean found = false;
                for (int i = 0; i < contacts.size(); i++) {
                    if (contacts.get(i).name.equalsIgnoreCase(oldName)) {
                        System.out.print("Enter new name: ");
                        String newName = sc.nextLine();
                        System.out.print("Enter new phone number: ");
                        String newPhone = sc.nextLine();
                        contacts.set(i, new Contact(newName, newPhone));
                        System.out.println("Contact updated.");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Contact not found.");
                }
            } 
            else if (ch != 5) {
                System.out.println("Invalid option. Try again.");
            }
        } while (ch != 5);

        System.out.println("Exiting program.");
        sc.close();
    }
}

