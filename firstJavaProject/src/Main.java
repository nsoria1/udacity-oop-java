public class Main {
    public static void main(String [] args){
        ContactsManager myContactsManager = new ContactsManager();

        // Create a new Contact object for James
        Contact friendGallo = new Contact();

        // Set the fields
        friendGallo.name = "Gallo";
        friendGallo.phoneNumber = "1166941113";

        // Add James Contact to the ContactsManager
        myContactsManager.addContact(friendGallo);

        // Now let's try to search of a contact and display their phone number
        Contact result = myContactsManager.searchContact("Gallo");
        System.out.println(result.phoneNumber);
    }
}