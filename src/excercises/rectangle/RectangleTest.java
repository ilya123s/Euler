package excercises.rectangle;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RectangleTest {
    
    //top left, bottom, right
    @Test
    public void testRectangleSameHeight(){
        
        Rectangle rect1 = new Rectangle(5.0, 0.0, 0.0, 5.0);
        Rectangle rect2 = new Rectangle(9.0, 0.0, 4.0, 9.0);
        
        assertTrue(rect1.intersects(rect2));
        assertTrue(rect2.intersects(rect1));
    }

    @Test
    public void testRectangleNotSameHeight(){
        
        Rectangle rect1 = new Rectangle(5.0, 0.0, 0.0, 5.0);
        Rectangle rect2 = new Rectangle(9.0, 0.0, 5.01, 9.0);
        
        assertFalse(rect1.intersects(rect2));
        assertFalse(rect2.intersects(rect1));
    }

    @Test
    public void testRectangleSamePlane(){
        
        Rectangle rect1 = new Rectangle(5.0, 0.0, 0.0, 5.0);
        Rectangle rect2 = new Rectangle(5.0, 5.0, 0.0, 10.0);
        
        assertTrue(rect1.intersects(rect2));
        assertTrue(rect2.intersects(rect1));
    }

    @Test
    public void testRectangleNotSamePlane(){
        
        Rectangle rect1 = new Rectangle(5.0, 0.0, 0.0, 5.0);
        Rectangle rect2 = new Rectangle(5.0, 5.00001, 0.0, 10.0);
        
        assertFalse(rect1.intersects(rect2));
        assertFalse(rect2.intersects(rect1));
    }
    
    @Test
    public void testRectangleInRectangleHeight(){
        
        Rectangle rect1 = new Rectangle(5.0, 0.0, 0.0, 5.0);
        Rectangle rect2 = new Rectangle(4.0, -1, 0.001, 4.0);
        
        assertTrue(rect1.intersects(rect2));
        assertTrue(rect2.intersects(rect1));
        
    }

    @Test
    public void testRectangleInRectanglePlane(){
        
        Rectangle rect1 = new Rectangle(5.0, 0.0, 0.0, 5.0);
        Rectangle rect2 = new Rectangle(6.0, 1.0, -1.0, 4.0);
        
        assertTrue(rect1.intersects(rect2));
        assertTrue(rect2.intersects(rect1));
        
    }

}
