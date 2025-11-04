import main.java.semicolonafr.models.Contact;
import main.java.semicolonafr.models.PhoneBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {
    private PhoneBook phoneBook;

    @BeforeEach
    public void setUp() {
        PhoneBook phoneBook = new PhoneBook();
    }

    @Test
    public void testAddContact() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals("You have successfully added a contact", phoneBook.addContact("Tayo", "08051170959"));
    }

    @Test
    public void testRemoveContact() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals("Contact can not be  found", phoneBook.removeContact("Tayo", "08051170959"));

    }

    @Test
    public void testSearchContact() {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Tayo", "08051170959");
        phoneBook.addContact("Femi", "08123456789");

        assertEquals("Tayo", phoneBook.searchContact("Tayo"));
        assertEquals("Femi", phoneBook.searchContact("Femi"));
    }










}
