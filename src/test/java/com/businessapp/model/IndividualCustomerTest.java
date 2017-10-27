/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.businessapp.model;

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
    
}
