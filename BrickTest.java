/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part3;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sstoneman1
 */
public class BrickTest {
    private Brick brick;
    
    public BrickTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("SETUP CLASS RUNNING -- Nothing to do.");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("TEARDOWN CLASS RUNNING -- Nothing to do.");
    }
    
    @Before
    public void setUp() {
        brick = new Brick(8,20,12);
    }
    
    @After
    public void tearDown() {
        System.out.println("TEARDOWN RUNNING -- Nothing to do.");
    }

    /**
     * Test of getSurfaceArea method, of class Brick.
     */
    @Test
    public void testGetSurfaceArea() {
        System.out.println("getSurfaceArea");
        assertEquals(992, brick.getSurfaceArea(), 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getWeight method, of class Brick.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        assertEquals( 3.84, brick.getWeight(), 0.0);
    }

    /**
     * Test of getVolume method, of class Brick.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        assertEquals(1920, brick.getVolume());
    }

    /**
     * Test of getHeight method, of class Brick.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        assertEquals(8, brick.getHeight());
    }
    
}
