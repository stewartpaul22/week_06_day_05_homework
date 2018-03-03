import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest1;

    @Before
    public void before() {
        guest1 = new Guest("Bob Carolgees");
    }

    @Test
    public void guestHasName() {
        assertEquals("Bob Carolgees", guest1.getName());
    }

}
