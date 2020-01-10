import java.util.List;

public interface Contacts {
//    List<Contact> all();
    List<Contact> getContacts();
    long saveContact(Contact contact);
    void deleteContactById(long id);
    Contact getContactById(long id);
}
