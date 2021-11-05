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
public class TblUser2Test {
    
    public TblUser2Test() {
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
     * Test of getEmail method, of class TblUser2.
     */
    @Test
    public void testGetEmail() {
        System.out.println("get Email registrasi");
        TblUser2 instance = new TblUser2();
        String expResult = "si";
        
        instance.setEmail(expResult);
        String result = instance.getEmail();
        assertEquals(expResult, result); 
    }

    /**
     * Test of setEmail method, of class TblUser2.
     */
    @Test
    public void testSetEmail() {
        System.out.println("Test set email registrasi");
        
        String email = "si";
        TblUser2 instance = new TblUser2();
        instance.setEmail(email);
    }

    /**
     * Test of save_user method, of class TblUser2.
     */
    @Test
    public void testSave_user() {
        System.out.println("Test Save User");
        
        TblUser2 instance = new TblUser2();
        //instance.save_user();
        instance.setIdUser(1);
        instance.setUsername("si");
        instance.setEmail("si@gmail.com");
        instance.setPassword("234");
        
        
        String expResult = "gagal";
        String result = instance.login_user();
        System.out.println(expResult);
        System.out.println(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of login_user method, of class TblUser2.
     */
    @Test
    public void testLogin_user() {
        System.out.println("Test Login User");
        
        TblUser2 instance = new TblUser2();
        instance.setUsername("si");
        instance.setPassword("234");
        
        String expResult = "gagal";
        String result = instance.login_user();
        System.out.println(expResult);
        System.out.println(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of log_us method, of class TblUser2.
     */
    @Test
    public void testLog_us() {
        System.out.println("Test Login registrasi");
        
        TblUser2 instance = new TblUser2();
        instance.setUsername("si");
        instance.setPassword("234");
        
        String expResult = "gagal";
        String result = instance.log_us();
        System.out.println(expResult);
        System.out.println(result);
        assertEquals(expResult, result);
    }

    
    /**
     * Test of getIdUser method, of class TblUser2.
     */
    @Test
    public void testGetIdUser() {
        System.out.println("get Id User");
        TblUser2 instance = new TblUser2();
        Integer expResult = null;
        Integer result = instance.getIdUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIdUser method, of class TblUser2.
     */
    @Test
    public void testSetIdUser() {
        System.out.println("set Id User");
        Integer idUser = null;
        TblUser2 instance = new TblUser2();
        instance.setIdUser(idUser);
    }

    /**
     * Test of getPassword method, of class TblUser2.
     */
    @Test
    public void testGetPassword() {
        System.out.println("Test get Password");
        TblUser2 instance = new TblUser2();
        String expResult = "234";
        
        instance.setPassword(expResult);
        String result = instance.getPassword();
        assertEquals(expResult, result);
        assertThat(expResult, is(notNullValue()));
    }

    /**
     * Test of setPassword method, of class TblUser2.
     */
    @Test
    public void testSetPassword() {
        System.out.println("Test set Password");
        
        String password = "234";
        TblUser2 instance = new TblUser2();
        instance.setPassword(password);
    }

    /**
     * Test of getUsername method, of class TblUser2.
     */
    @Test
    public void testGetUsername() {
        System.out.println("Test get Username");
        
        TblUser2 instance = new TblUser2();
        String expResult = "si";
        
        instance.setUsername(expResult);
        String result = instance.getUsername();
        assertEquals(expResult, result); 
    }

    /**
     * Test of setUsername method, of class TblUser2.
     */
    @Test
    public void testSetUsername() {
        System.out.println("Test set Username");
        
        String username = "si";
        TblUser2 instance = new TblUser2();
        instance.setUsername(username);
    }
    
}
