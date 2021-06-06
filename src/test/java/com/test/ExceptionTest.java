/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;
import static org.junit.Assert.fail;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;

/**
 *
 * @author gusta
 */
public class ExceptionTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void empty() {
        ArrayList<String> notEmptyList = new ArrayList<>(Arrays.asList("Gustavo", "Nascimento", "Bussolotti"));
        ArrayList<String> emptyList = new ArrayList<>();
        notEmptyList.get(0);
        emptyList.get(0);
    }
    
   @Test
   public void testTryCath(){
   
        ArrayList<String> emptyList = new ArrayList<>();
        try{
            emptyList.get(0);
            fail("Not throw expected IndexOutOfBoundsException");
        }catch(IndexOutOfBoundsException e){
            //Check the message of exception is expected
            Assert.assertEquals("Index: 0, Size: 0", e.getMessage());
        }
   }
    

}
