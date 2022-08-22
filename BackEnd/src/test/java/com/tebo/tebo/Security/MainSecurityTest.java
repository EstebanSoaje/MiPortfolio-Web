/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tebo.tebo.Security;

import com.tebo.tebo.Security.jwt.JwtTokenFilter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author Tebo
 */
public class MainSecurityTest {
    
    public MainSecurityTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of jwtTokenFilter method, of class MainSecurity.
     */
    @Test
    public void testJwtTokenFilter() {
        System.out.println("jwtTokenFilter");
        MainSecurity instance = new MainSecurity();
        JwtTokenFilter expResult = null;
        JwtTokenFilter result = instance.jwtTokenFilter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of passwordEncoder method, of class MainSecurity.
     */
    @Test
    public void testPasswordEncoder() {
        System.out.println("passwordEncoder");
        MainSecurity instance = new MainSecurity();
        PasswordEncoder expResult = null;
        PasswordEncoder result = instance.passwordEncoder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of configure method, of class MainSecurity.
     */
    @Test
    public void testConfigure_HttpSecurity() throws Exception {
        System.out.println("configure");
        HttpSecurity http = null;
        MainSecurity instance = new MainSecurity();
        instance.configure(http);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of authenticationManager method, of class MainSecurity.
     */
    @Test
    public void testAuthenticationManager() throws Exception {
        System.out.println("authenticationManager");
        MainSecurity instance = new MainSecurity();
        AuthenticationManager expResult = null;
        AuthenticationManager result = instance.authenticationManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of authenticationManagerBean method, of class MainSecurity.
     */
    @Test
    public void testAuthenticationManagerBean() throws Exception {
        System.out.println("authenticationManagerBean");
        MainSecurity instance = new MainSecurity();
        AuthenticationManager expResult = null;
        AuthenticationManager result = instance.authenticationManagerBean();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of configure method, of class MainSecurity.
     */
    @Test
    public void testConfigure_AuthenticationManagerBuilder() throws Exception {
        System.out.println("configure");
        AuthenticationManagerBuilder auth = null;
        MainSecurity instance = new MainSecurity();
        instance.configure(auth);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
