import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testReversedInPlace2() {
    int[] input1 = {1,2,3};
    ArrayExamples.reverseInPlace(input1);
    System.out.println("IN PLACE");
    for (int i = 0;i < input1.length; i++) {
      System.out.print(input1[i] + " ");
    }
    System.out.println("");

    assertArrayEquals(new int[]{3,2,1}, input1);

  }
  @Test
  public void testReversed2() {
    int[] input1 = {1,2,3};

    for (int i = 0; i < ArrayExamples.reversed(input1).length; i++) {
      System.out.print(ArrayExamples.reversed(input1)[i] + " ");
    }
    System.out.println("");


    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));
  }
  
}
