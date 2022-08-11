/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author loaner
 */
public class MainTest {
    
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Main.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
     @Test
    public void testCheckValueGood() {
        System.out.println("checkvalue Good ");
        int check = 1;
        boolean expResult = true;
        boolean result = Main.checkValue(check);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
     @Test
    public void testCheckValueBad() {
        System.out.println("checkvalue Bad ");
        int check = 6;
        boolean expResult = false;
        boolean result = Main.checkValue(check);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
     
     @Test
    public void testCheckValueBoundary() {
        System.out.println("checkValue Boundary ");
        int check = 0;
        boolean expResult = false;
        boolean result = Main.checkValue(check);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    
     @Test
    public void testCheckSpecialGood(){
        System.out.println("checkSpecial Good");
        String check = "Om";
        boolean expResult = true;
        boolean result = Main.checkSpecial(check);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
     @Test
    public void testCheckSpecialBad(){
        System.out.println("checkSpecial bad");
        String check = "$@";
        boolean expResult = false;
        boolean result = Main.checkSpecial(check);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
     @Test
    public void testCheckSpecialBoundary(){
        System.out.println("checkSpecial Boundary");
        String check = " ";
        boolean expResult = false;
        boolean result = Main.checkSpecial(check);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
        @Test
    public void testCheckBetGood(){
        System.out.println("checkBet Good");
        double check = 100;
        boolean expResult = true;
        boolean result = Main.checkBet(check);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
      @Test
    public void testCheckBetBad(){
        System.out.println("checkBet Bad");
        double check = 0;
        boolean expResult = false;
        boolean result = Main.checkBet(check);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
      @Test
    public void testCheckBetBoundary(){
        System.out.println("checkBet Boundary");
        double check = -1;
        boolean expResult = false;
        boolean result = Main.checkBet(check);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    
     @Test
    public void testCheckPlayerGood(){
        System.out.println("checkPlayer Good");
        int check = 2;
        boolean expResult = true;
        boolean result = Main.CheckPlayer(check);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
     @Test
    public void testCheckPlayerBad(){
        System.out.println("checkPlayer Bad");
        int check = 18;
        boolean expResult = false;
        boolean result = Main.CheckPlayer(check);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
     @Test
    public void testCheckPlayerBoundary(){
        System.out.println("checkPlayer Boundary");
        int check = -2;
        boolean expResult = false;
        boolean result = Main.CheckPlayer(check);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}
