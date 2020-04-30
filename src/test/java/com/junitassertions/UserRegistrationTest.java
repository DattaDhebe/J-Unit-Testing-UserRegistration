package com.junitassertions;

import org.junit.Assert;
import org.junit.Test;



public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidation userValidate = new UserRegistrationValidation();
        boolean result = userValidate.validateFirstName("Datta");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
        UserRegistrationValidation userValidate = new UserRegistrationValidation();
        boolean result = userValidate.validateFirstName("da");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidation userValidate = new UserRegistrationValidation();
        boolean result = userValidate.validateLastName("Dhebe");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnTrue() {
        UserRegistrationValidation userValidate = new UserRegistrationValidation();
        boolean result = userValidate.validateLastName("dh");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidation userValidate = new UserRegistrationValidation();
        boolean result = userValidate.validateEmail("dattadhebe75@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnTrue() {
        UserRegistrationValidation userValidate = new UserRegistrationValidation();
        boolean result = userValidate.validateEmail("@gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobile_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidation userValidate = new UserRegistrationValidation();
        boolean result = userValidate.validateMobile("91 8149277030");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobile_WhenNotProper_ShouldReturnTrue() {
        UserRegistrationValidation userValidate = new UserRegistrationValidation();
        boolean result = userValidate.validateMobile("77030");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidation userValidate = new UserRegistrationValidation();
        boolean result = userValidate.validatePassword("Thes@12datta");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturnTrue() {
        UserRegistrationValidation userValidate = new UserRegistrationValidation();
        boolean result = userValidate.validatePassword("theks");
        Assert.assertFalse(result);
    }



}
