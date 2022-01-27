package utils.example.utils;



import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MyArrayListTest {

    @Test
     public void addListTest(){
        User user = new User(1, "Muhammad", "Karachi");
        assertEquals(user.getId(), 1, "id");
        assertEquals(user.getName(), "Muhammad", "name");
        assertEquals(user.getCity(), "Karachi", "city");
    }

    @Test
    public void addListTestNotEqual(){
        User user = new User(2,"Ahmed", "Lahore");
        assertNotEquals(user.getCity(), null, "city");
        assertNotEquals(user.getId(), "1", "id");
        assertNotEquals(user.getName(), null, "name");
    }
}
