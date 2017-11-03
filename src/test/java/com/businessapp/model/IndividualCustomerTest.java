/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.businessapp.model;

import com.businessapp.model.IndividualCustomer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mcy
 */
public class IndividualCustomerTest {
     
    private IndividualCustomer a;
    
     public IndividualCustomerTest() {
    }

    /**
     * Test of getFirstName method, of class IndividualCustomer.
     */
    @Test
    public void testGetFirstName() {
        a = new IndividualCustomer();
        a.setFirstName("Meyer");
        final String testStr="Meyer"; 
        assertTrue(testStr.equals(a.getFirstName()));
    }
    
    @Test
    public void testGetLastName() {
        a = new IndividualCustomer();
        a.setName("Hans");
        final String testStr="Hans"; 
        assertTrue(testStr.equals(a.getName()));
    }
    
     @Test
    public void testId() {
        a = new IndividualCustomer();
        a.setId("12345563");
        final String testStr="12345563"; 
        assertTrue(testStr.equals(a.getId()));
        
    }
    
    
    
    
     @Test
    public void testCreated() {
        DateFormat formatter = new SimpleDateFormat( "dd-MM-yyyy" );
        Date date;
        a = new IndividualCustomer();
        try {
            date = formatter.parse( "12-03-2008" );
            a.setCreated(date);
            assertTrue(date.toString().equals(a.getCreated().toString()));
        } catch (ParseException ex) {
            Logger.getLogger(IndividualCustomerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }


    
    @Test
    public void testLeererString() {
         a = new IndividualCustomer();
         a.setFirstName("");
         assertTrue(a.getFirstName().isEmpty());
        
    }
    
    @Test
    public void testNull(){
        a = new IndividualCustomer();
        a.setFirstName(null);
        assertTrue(a.getFirstName()==null);
        
    }
    
    @Test
    public void testLeererStringLastName() {
         a = new IndividualCustomer();
         a.setName("");
         assertTrue(a.getName().isEmpty());
        
    }
    
    @Test
    public void testNullLastName(){
        a = new IndividualCustomer();
        a.setName(null);
        assertTrue(a.getName()==null);
        
    }
    
    @Test
    public void testLeererStringId() {
         a = new IndividualCustomer();
         a.setId("");
         assertTrue(a.getId().isEmpty());
        
    }
    
    @Test
    public void testNullId(){
        a = new IndividualCustomer();
        a.setId(null);
        assertTrue(a.getId()==null);
        
    }
      @Test
       public void testNullDate() {
         a = new IndividualCustomer();
         Date date = null;
         a.setCreated(date);
         assertTrue(a.getCreated()==null);
        
    }
    
  
    
}
