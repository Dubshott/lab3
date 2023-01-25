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
  public void testReverseInPlaceMultipleNums() {
    int[] input1 = { 2, 3, 4 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4,3,2}, input1);
  }
  
  @Test
  public void testReversedTwo() {
  int[] input1 = { 5,3,1 };
  assertArrayEquals(new int[]{1,3,5}, ArrayExamples.reversed(input1));
  }
}
