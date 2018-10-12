/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.modele;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ac532323
 */
public class BananeTest {
    
    public BananeTest() {
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
        @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Fruit instance = new Banane(2.0,"Martinique");
        double expResult = 2.0;
        double result = instance.getPrix();
        assertTrue(result == expResult);
    }

    /**
     * Test of getOrigine method, of class Orange.
     */
    @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        Fruit instance = new Banane(2.0,"Guadeloupe");
        String expResult = "Guadeloupe";
        String result = instance.getOrigine();
        assertTrue(result.equals(expResult));
    }
    
}
