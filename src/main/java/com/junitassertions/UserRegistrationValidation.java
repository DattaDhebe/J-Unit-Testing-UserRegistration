package com.junitassertions;

import java.util.Scanner;

public class UserRegistrationValidation {
    private static String patternFor_FirstName = "^[A-Z]{1}[a-z]{3,}";
    private static String patternFor_LastName = "^[A-Z]{1}[a-z]{3,}";
    private static String patternFor_Email = "^[a-zA-Z0-9]+([.][a-zA-Z0-9]+)?@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2})?";
    private static String patternFor_Mobile = "^([0-9]{2}[ ])?[0-9]{10}";
    private static String patternFor_Password = "^(?=.*[a-z])(?=.*d)(?=.*[@#$%])(?=.*[A-Z]).{8,}";

    public static boolean validateFirstName(String firstName) {

        return (firstName.matches(patternFor_FirstName));

    }


    public boolean validateLastName(String lastName) {

        return (lastName.matches(patternFor_LastName));

    }

    public boolean validateEmail(String email) {

        return (email.matches(patternFor_Email));

    }


    public boolean validateMobile(String mobile) {

        return (mobile.matches(patternFor_Mobile));

    }


    public boolean validatePassword(String password) {

        return (password.matches(patternFor_Password));

    }
}

