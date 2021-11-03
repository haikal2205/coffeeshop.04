/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.TblUser;

/**
 *
 * @author haikal walid
 */
public class DAOLoginTest {
    
    public DAOLoginTest() {
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
     * Test of getBy method, of class DAOLogin.
     */
    @Test
    public void testGetBy() {
        System.out.println("getBy");
        String uName = "";
        String uPass = "";
        DAOLogin instance = new DAOLogin();
        List<TblUser> expResult = null;
        List<TblUser> result = instance.getBy(uName, uPass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add_user method, of class DAOLogin.
     */
    @Test
    public void testAdd_user() {
        System.out.println("add_user");
        TblUser user = null;
        DAOLogin instance = new DAOLogin();
        instance.add_user(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
