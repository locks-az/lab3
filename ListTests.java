import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
	@Test 
	public void testAppend() {


    checkString filter = new checkString();

    List<String> tester = new ArrayList<>();
    tester.add("a");
    tester.add("b");
    tester.add("c");

    List<String> expected = new ArrayList<>();
    expected.add("a");
    expected.add("c");

    assertEquals(expected, ListExamples.filter(tester, filter));
  }
}
