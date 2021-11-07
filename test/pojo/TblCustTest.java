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
public class TblCustTest {
    
    public TblCustTest() {
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
     * Test of getNameCust method, of class TblCust.
     */
    @Test
    public void testGetNameCust() {
        System.out.println("get Name Cust");
        String expResult = "oyo";
        
        TblCust instance = new TblCust();
        instance.setNameCust(expResult);
        String result = instance.getNameCust();
        assertEquals(expResult, result);
    }   
    /**
     * Test of setNameCust method, of class TblCust.
     */
    @Test
    public void testSetNameCust() {
        System.out.println("Test set Name Customer");
        
        String nameCust = "oyo";
        TblCust instance = new TblCust();
        instance.setNameCust(nameCust);
    }
    /**
     * Test of getEmail method, of class TblCust.
     */
    @Test
    public void testGetEmail() {
        System.out.println("get email");
        String expResult = "oyo@gmail.com";
        
        TblCust instance = new TblCust();
        instance.setNameCust(expResult);
        String result = instance.getNameCust();
        assertEquals(expResult, result);
    }
    /**
     * Test of setEmail method, of class TblCust.
     */
    @Test
    public void testSetEmail() {
        System.out.println("Test set email");
        
        String email = "oyo@gmail,com";
        TblCust instance = new TblCust();
        instance.setEmail(email);
    }
    /**
     * Test of getNoTlpn method, of class TblCust.
     */
    @Test
    public void testGetNoTlpn() {
        System.out.println("get no Tlp");
        String expResult = "1234";
        
        TblCust instance = new TblCust();
        instance.setNoTlpn(expResult);
        String result = instance.getNoTlpn();
        assertEquals(expResult, result);
    }
    /**
     * Test of setNoTlpn method, of class TblCust.
     */
    @Test
    public void testSetNoTlpn() {
        System.out.println("Test set no tlp");
        
        String noTlpn = "1234";
        TblCust instance = new TblCust();
        instance.setNoTlpn(noTlpn);
    }
    /**
     * Test of getBook method, of class TblCust.
     */
    @Test
    public void testGetBook() {
         System.out.println("get  Book");
        String expResult = "12-18";
        
        TblCust instance = new TblCust();
        instance.setBook(expResult);
        String result = instance.getBook();
        assertEquals(expResult, result);
    }
    /**
     * Test of setBook method, of class TblCust.
     */
    @Test
    public void testSetBook() {
        System.out.println("Test set book");
        
        String book = "12-18";
        TblCust instance = new TblCust();
        instance.setBook(book);
    }
    /**
     * Test of getAllRecoordss method, of class TblCust.
     */
    @Test
    public void testGetAllRecoordss() {
        System.out.println("Test get All Records");
        
        TblCust instance = new TblCust();
        int expResult = 15;
        List<TblCust> result = instance.getAllRecoordss();
        assertEquals(expResult, result.toArray().length);
    }
    /**
     * Test of getByIdcus method, of class TblCust.
     */
    @Test
    public void testGetByIdcus() {
        System.out.println("get by ID customer");
        
        TblCust instance = new TblCust();
        instance.setIdCustomer(1);
        
        Integer expResult = 1;
        Integer result = instance.getIdCustomer();
        assertEquals(expResult, result); 
    }
    /**
     * Test of deleteea method, of class TblCust.
     */
    @Test
    public void testDeleteea() {
        System.out.println("delete");
        
        TblCust instance = new TblCust();
        instance.setIdCustomer(15);
        
        String expResult = "form_minuman";
        instance.deleteea();
    }
    /**
     * Test of getIdCustomer method, of class TblCust.
     */
    @Test
    public void testGetIdCustomer() {
        System.out.println("Test get Id Customer");
        
        TblCust instance = new TblCust();
        
        Integer expResult = 1;
        instance.setIdCustomer(expResult);
        Integer result = instance.getIdCustomer();
        assertEquals(expResult, result);
        assertThat(expResult, is(notNullValue()));
    }
    /**
     * Test of setIdCustomer method, of class TblCust.
     */
    @Test
    public void testSetIdCustomer() {
        System.out.println("Test set Id customer");
        
        Integer idCustomer = 1;
        TblCust instance = new TblCust();
        instance.setIdCustomer(idCustomer);
    }
    
}
