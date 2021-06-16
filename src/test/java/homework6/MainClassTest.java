package homework6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainClassTest {

    public MainClass mainClass;

    @BeforeEach
    public void init() {
        mainClass = new MainClass();
    }

    @Test
    public void testSplitByLastFourFirst() {
        Assertions.assertArrayEquals(new int[]{5, 6, 7, 8, 9, 10}, mainClass.splitByLastFour(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    @Test
    public void testSplitByLastFourSecond() {
        Assertions.assertArrayEquals(new int[]{5, 6, 7}, mainClass.splitByLastFour(new int[]{4, 1, 3, 4, 5, 6, 7}));
    }

    @Test
    public void testSplitByLastFourThird() {
        Assertions.assertArrayEquals(new int[]{1, 2, 3}, mainClass.splitByLastFour(new int[]{4, 7, 4, 7, 8, 9, 4, 1, 2, 3}));
    }

    @Test
    public void testCheckArrayByOneAndFourFirst() {
        Assertions.assertTrue(mainClass.checkArrayByOneAndFour(new int[]{1, 1, 1, 4, 1, 4}));
    }

    @Test
    public void testCheckArrayByOneAndFourSecond() {
        Assertions.assertTrue(mainClass.checkArrayByOneAndFour(new int[]{4, 4, 4, 4, 1, 4}));
    }

    @Test
    public void testCheckArrayByOneAndFourThird() {
        Assertions.assertTrue(mainClass.checkArrayByOneAndFour(new int[]{4, 1, 4, 10}));
    }


}