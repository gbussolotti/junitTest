/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import java.io.File;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

/**
 *
 * @author gusta
 */
public class RuleTest {
    
    //Tag Rule means that execute before test
    @Rule
    public TemporaryFolder folder = new TemporaryFolder();
    
    @Test
    public void shouldCreateFileInTemporaryFolder() throws IOException{
        File created = folder.newFile("file.txt");
        Assert.assertTrue(created.isFile());
        Assert.assertEquals(folder.getRoot(), created.getParentFile());
    }
   
    
}
