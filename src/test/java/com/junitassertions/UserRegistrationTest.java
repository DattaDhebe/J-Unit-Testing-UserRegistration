package com.junitassertions;

import org.junit.Assert;
import org.junit.Test;



public class UserRegistrationTest {

    UserRegistrationValidation userValidate = new UserRegistrationValidation();
    boolean result;

    @Test
    public void givenName_WhenProper_ShouldReturnTrue() {
        result = userValidate.validateName("Datta");
        Assert.assertTrue(result);
    }

    @Test
    public void givenName_WhenLessThanThreeCharacter_ShouldReturnFalse() {
        result = userValidate.validateName("da");
        Assert.assertFalse(result);
    }

    @Test
    public void givenName_WhenNumbers_ArePresent_ShouldReturnFalse() {
        result = userValidate.validateName("Dag2635");
        Assert.assertFalse(result);
    }

    @Test
    public void givenName_WhenDoesNotCantainsFirstLetterCapital_ShouldReturnFalse() {
        result = userValidate.validateName("datta");
        Assert.assertFalse(result);
    }


    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        result = userValidate.validateEmail("dattadhebe75@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnTrue() {
        result = userValidate.validateEmail("@gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenAddedDotBeforeAtTheRate_ShouldReturnTrue() {
        result = userValidate.validateEmail("abc.@gmail.com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenAddedCharactersAfterAtTheRate_ShouldReturnTrue() {
        result = userValidate.validateEmail("abc.xyz@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenAddedManyDotAfterAtTheRate_ShouldReturnTrue() {
        result = userValidate.validateEmail("abc@gmail.com.co.in");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobile_WhenProper_ShouldReturnTrue() {
        result = userValidate.validateMobile("91 8149277030");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobile_WhenLessThanTenNumbers_ShouldReturnFalse() {
        result = userValidate.validateMobile("77030");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobile_WhenOnlyNumbersPresent_ShouldReturnTrue() {
        result = userValidate.validateMobile("8149277030");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobile_WhenSpaceNotAvailable_BetweenContryCodeAndMobileNumber_ShouldReturnFalse() {
        result = userValidate.validateMobile("918149277030");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        result = userValidate.validatePassword("Thes@12datta");
        Assert.assertTrue(result);
    }


    @Test
    public void givenPassword_WhenLessThanEightCharacter_ShouldReturnFalse() {
        result = userValidate.validatePassword("theks");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenNumbersNotPresent_ShouldReturnFalse() {
        result = userValidate.validatePassword("Thesdsatta");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenSpecialCharacterAbsent_ShouldReturnFalse() {
        result = userValidate.validatePassword("Thes12datta");
        Assert.assertFalse(result);
    }

}
