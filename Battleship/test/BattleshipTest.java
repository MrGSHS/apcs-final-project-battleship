/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maorgozalzani
 */
public class BattleshipTest {
    private Pattern rect=new Rectangle(5,5,6,6);
    private Battleship battle= new Battleship(4,2,rect,5,5,"south");
    
    public BattleshipTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Pattern rect=new Rectangle(5,5,6,6);
        Battleship battle= new Battleship(4,2,rect,5,5,"south");    
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getRow method, of class Battleship.
     */
    @Test
    public void testGetRow() {
        System.out.println("getRow");
        Battleship instance = battle;
        int expResult = 5;
        int result = instance.getRow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCol method, of class Battleship.
     */
    @Test
    public void testGetCol() {
        System.out.println("getCol");
        Battleship instance = battle;
        int expResult = 5;
        int result = instance.getCol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getSpeed method, of class Battleship.
     */
    @Test
    public void testGetSpeed() {
        System.out.println("getSpeed");
        Battleship instance = battle;
        int expResult = 2;
        int result = instance.getSpeed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getOrientation method, of class Battleship.
     */
    @Test
    public void testGetOrientation() {
        System.out.println("getOrientation");
        Battleship instance = battle;
        String expResult = "south";
        String result = instance.getOrientation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    // COMMENTED SET METHODS

//    /**
//     * Test of setOrientation method, of class Battleship.
//     */
//    @Test
//    public void testSetOrientation() {
//        System.out.println("setOrientation");
//        String orientation = "";
//        Battleship instance = null;
//        instance.setOrientation(orientation);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setRow method, of class Battleship.
//     */
//    @Test
//    public void testSetRow() {
//        System.out.println("setRow");
//        int row = 0;
//        Battleship instance = null;
//        instance.setRow(row);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setCol method, of class Battleship.
//     */
//    @Test
//    public void testSetCol() {
//        System.out.println("setCol");
//        int col = 0;
//        Battleship instance = null;
//        instance.setCol(col);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of move method, of class Battleship.
     */
    // MUST FINISH MOVE TO FINISH TEST
    @Test
    public void testMove() {
        System.out.println("move");
        int[][] gameBoard = new int[30][30];
        Battleship instance = battle;
        int[][] expResult = null;
        int[][] result = instance.move(gameBoard);
        assertArrayEquals(expResult, result);
        System.out.print(gameBoard);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
