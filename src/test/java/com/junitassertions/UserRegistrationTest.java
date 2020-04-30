package com.junitassertions;

import org.junit.Assert;
import org.junit.Test;



public class UserRegistrationTest {

    @Test
    public void givenName_WhenProper_ShouldReturnTrue() {
        UserRegistrationValidation userValidate = new UserRegistrationValidation();
        boolean result = userValidate.validateName("Datta");
        Assert.assertTrue(result);
    }

    @Test
    public void givenName_WhenLessThanThreeCharacter_ShouldReturnFalse() {
        UserRegistrationValidation userValidate = new UserRegistrationValidation();
        boolean result = userValidate.validateName("da");
        Assert.assertFalse(result);
    }

    @Test
    public void givenName_WhenNumbers_ArePresent_ShouldReturnFalse() {
        UserRegistrationValidation userValidate = new UserRegistrationValidation();
        boolean result = userValidate.validateName("Dag2635");
        Assert.assertFalse(result);
    }

    @Test
    public void givenName_WhenDoesNotCantainsFirstLetterCapital_ShouldReturnFalse() {
        UserRegistrationValidation userValidate = new UserRegistrationValidation();
        boolean result = userValidate.validateName("datta");
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
