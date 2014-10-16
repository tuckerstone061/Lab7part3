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
public class PaletteTest {
    
    private Palette pal;
    
    public PaletteTest() {
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
        pal = new Palette(10,10);
    }
    
    @After
    public void tearDown() {
        System.out.println("TEARDOWN RUNNING -- Nothing to do.");
    }

    /**
     * Test of getWeight method, of class Palette.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        pal = new Palette(10,10);
        assertEquals(384, pal.getWeight(), 0.0);
    }

    /**
     * Test of getHeight method, of class Palette.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        assertEquals(95, pal.getHeight(), 0.0);
    }
    
}
