import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;

public class SortUtilTest {

    @Test
    public void testSortArray() {
        // Create object of the logic class
        SortUtil util = new SortUtil();

        // Input array
        int[] arr = {5, 2, 9, 1, 4, 6 , 3};

        // Call the sortArray method
        int[] sorted = util.sortArray(arr);

        // Expected array
        int[] expected = {1, 2, 3, 5,6, 9};

        // Verify the result
        Assert.assertTrue(Arrays.equals(sorted, expected), "Array is not sorted correctly!");
    }
}