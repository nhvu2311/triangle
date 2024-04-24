import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

    @Test
    public void testIsTriangle() {
        assertTrue(App.isTriangle(3, 4, 5));
        assertFalse(App.isTriangle(1, 1, 3));
    }

    @Test
    public void testIsEquilateral() {
        assertTrue(App.isEquilateral(3, 3, 3));
        assertFalse(App.isEquilateral(3, 4, 3));
        assertFalse(App.isEquilateral(1, 1, 2));
        assertFalse(App.isEquilateral(3, 3, 4));
    }

    @Test
    public void testIsIsosceles() {
        assertTrue(App.isIsosceles(3, 3, 5));
        assertTrue(App.isIsosceles(1, 1, 2));
        assertTrue(App.isIsosceles(1, 1, 1));
        assertTrue(App.isIsosceles(3, 5, 3));
        assertTrue(App.isIsosceles(5, 3, 3));
        assertFalse(App.isIsosceles(1, 4, 2));
    }

    @Test
    public void testIsScalene() {
        assertTrue(App.isScalene(3, 4, 5));
        assertFalse(App.isScalene(1, 1, 2));
        assertFalse(App.isScalene(3, 3, 3));
        assertFalse(App.isScalene(4, 4, 2));
        assertTrue(App.isScalene(3, 7, 8));
        assertFalse(App.isScalene(4, 2, 4));
        assertFalse(App.isScalene(2, 4, 4));
    }

    @Test
    public void testIsRightTriangle() {
        assertTrue(App.isRightTriangle(3, 4, 5));
        assertFalse(App.isRightTriangle(3, 3, 3));
        assertFalse(App.isRightTriangle(1, 1, 2));
        assertFalse(App.isRightTriangle(4, 4, 2));
        assertFalse(App.isRightTriangle(3, 7, 8));
        assertTrue(App.isRightTriangle(5, 4, 3));
        assertTrue(App.isRightTriangle(4, 3, 5));
        assertTrue(App.isRightTriangle(5, 3, 4));
    }
}