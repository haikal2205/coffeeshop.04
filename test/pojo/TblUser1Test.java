/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.List;
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
public class TblUser1Test {
    
    public TblUser1Test() {
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
     * Test of getEmail method, of class TblUser1.
     */
    @Test
    public void testGetEmail() {
        System.out.println("Test get Email Admin");
        
        TblUser1 instance = new TblUser1();
        String expResult = "fe";
        
        instance.setEmail(expResult);
        String result = instance.getEmail();
        assertEquals(expResult, result); 
    }

    /**
     * Test of setEmail method, of class TblUser1.
     */
    @Test
    public void testSetEmail() {
        System.out.println("Test set email admin");
        
        String email = "fe";
        TblUser1 instance = new TblUser1();
        instance.setEmail(email);
    }

    /**
     * Test of save_user method, of class TblUser1.
     */
    @Test
    public void testSave_user() {
        System.out.println("Test Save User");
        
        TblUser1 instance = new TblUser1();
        //instance.save_user();
        instance.setIdUser(1);
        instance.setUsername("fe");
        instance.setEmail("fe@gmail.com");
        instance.setPassword("123");
        
        
        String expResult = "gagal";
        String result = instance.login_user();
        System.out.println(expResult);
        System.out.println(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of login_user method, of class TblUser1.
     */
    @Test
    public void testLogin_user() {
        System.out.println("Test Login User");
        
        TblUser1 instance = new TblUser1();
        instance.setUsername("fe");
        instance.setPassword("123");
        
        String expResult = "gagal";
        String result = instance.login_user();
        System.out.println(expResult);
        System.out.println(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of log_us method, of class TblUser1.
     */
    @Test
    public void testLog_us() {
        System.out.println("Test Login Admin");
        
        TblUser1 instance = new TblUser1();
        instance.setUsername("haikal");
        instance.setPassword("456");
        
        String expResult = "dashboard";
        String result = instance.log_us();
        System.out.println(expResult);
        System.out.println(result);
        assertEquals(expResult, result);
    }

    
    /**
     * Test of getIdUser method, of class TblUser1.
     */
    @Test
    public void testGetIdUser() {
        System.out.println("get Id User");
        TblUser1 instance = new TblUser1();
        Integer expResult = null;
        Integer result = instance.getIdUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdUser method, of class TblUser1.
     */
    @Test
    public void testSetIdUser() {
        System.out.println("set Id User");
        Integer idUser = null;
        TblUser1 instance = new TblUser1();
        instance.setIdUser(idUser);
    }

    /**
     * Test of getPassword method, of class TblUser1.
     */
    @Test
    public void testGetPassword() {
        System.out.println("Test get Password");
        TblUser1 instance = new TblUser1();
        String expResult = "456";
        
        instance.setPassword(expResult);
        String result = instance.getPassword();
        assertEquals(expResult, result);
        assertThat(expResult, is(notNullValue()));
    }

    /**
     * Test of setPassword method, of class TblUser1.
     */
    @Test
    public void testSetPassword() {
        System.out.println("Test set Password");
        
        String password = "456";
        TblUser1 instance = new TblUser1();
        instance.setPassword(password);
    }

    /**
     * Test of getUsername method, of class TblUser1.
     */
    @Test
    public void testGetUsername() {
        System.out.println("Test get Username");
        
        TblUser1 instance = new TblUser1();
        String expResult = "haikal";
        
        instance.setUsername(expResult);
        String result = instance.getUsername();
        assertEquals(expResult, result); 
    }

    /**
     * Test of setUsername method, of class TblUser1.
     */
    @Test
    public void testSetUsername() {
        System.out.println("Test set Username");
        
        String username = "haikal";
        TblUser1 instance = new TblUser1();
        instance.setUsername(username);
    }
    
}
