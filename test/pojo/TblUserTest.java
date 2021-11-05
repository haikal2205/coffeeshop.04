/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author haikal walid
 */
public class TblUserTest {
    
    public TblUserTest() {
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
     * Test of login_user method, of class TblUser.
     */
    @Test
    public void testLogin_user() {
        System.out.println("test login Customer");
        
        TblUser instance = new TblUser();
        instance.setUsername("ica");
        instance.setPassword("123");
        
        String expResult = "rumah";
        String result = instance.login_user();
        System.out.println(expResult);
        System.out.println(result);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getByIdus method, of class TblUser.
     */
    @Test
    public void testGetByIdus() {
        System.out.println("test get By Id user");
        TblUser instance = new TblUser();
        Integer expResult = 1;
        instance.setIdUser(expResult);
        Integer result = instance.getIdUser();
        assertEquals(expResult, result);
         assertThat(expResult, is(notNullValue()));
     
    }
  
    /**
     * Test of getIdUser method, of class TblUser.
     */
    @Test
    public void testGetIdUser() {
        System.out.println("test get Id user");
        TblUser instance = new TblUser();
        Integer expResult = 1;
        instance.setIdUser(expResult);
        Integer result = instance.getIdUser();
        assertEquals(expResult, result);
         assertThat(expResult, is(notNullValue()));
    }

    /**
     * Test of setIdUser method, of class TblUser.
     */
    @Test
    public void testSetIdUser() {
        System.out.println("Test set Id user");
        
        Integer idUser = 1;
        TblUser instance = new TblUser();
        instance.setIdUser(idUser);
    }

    /**
     * Test of getPassword method, of class TblUser.
     */
    @Test
    public void testGetPassword() {
       System.out.println("Test get Password");
        TblUser instance = new TblUser();
        String expResult = "123";
        
        instance.setPassword(expResult);
        String result = instance.getPassword();
        assertEquals(expResult, result);
        assertThat(expResult, is(notNullValue()));
    }

    /**
     * Test of setPassword method, of class TblUser.
     */
    @Test
    public void testSetPassword() {
        System.out.println("Test set Password");
        
        String password = "123";
        TblUser instance = new TblUser();
        instance.setPassword(password);
    }

    /**
     * Test of getUsername method, of class TblUser.
     */
    @Test
    public void testGetUsername() {
        System.out.println("Test get Username");
        
        TblUser instance = new TblUser();
        String expResult = "ica";
        
        instance.setUsername(expResult);
        String result = instance.getUsername();
        assertEquals(expResult, result); 
    }

    /**
     * Test of setUsername method, of class TblUser.
     */
    @Test
    public void testSetUsername() {
        System.out.println("Test set Username");
        
        String username = "ica";
        TblUser instance = new TblUser();
        instance.setUsername(username);;
    }
    
}
