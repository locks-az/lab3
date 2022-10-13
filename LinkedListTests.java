import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
	@Test 
	public void testAppend() {
    LinkedList temp = new LinkedList();
    temp.append(1);
    temp.append(2);
    temp.append(3);

    System.out.println(temp.toString());
    assertEquals("1 2 3 ", temp.toString());
	}


}
