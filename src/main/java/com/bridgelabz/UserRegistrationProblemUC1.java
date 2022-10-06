package com.bridgelabz;

public class UserRegistrationProblemUC1 {
    public boolean firstName(String firstname) throws CustomExceptions {
        //UC1- User need to enter a valid FirstName
        // First name starts with Cap and has minimum 3 characters
        String nameRegex = "^[A-Z]{1}[a-z]{2}$";
        firstname.matches(nameRegex);

        if (firstname.matches(nameRegex)) {
            System.out.println("Valid FirstName is" + " " + firstname);

        } else {
            throw new CustomExceptions("Invalid FirstName and having More or less than 3 Characters");

        }
        return firstname.matches(nameRegex);
    }

    public boolean lastName(String lastname) throws CustomExceptions {
        //UC2- User need to enter a valid LastName
        // Last name starts with Cap and has minimum 3 characters
        String nameRegex = "^[A-Z]{1}[a-z]{2}$";
        lastname.matches(nameRegex);

        if (lastname.matches(nameRegex)) {
            System.out.println("Valid Last Name is" + " " + lastname);

        } else {
            throw new CustomExceptions("Invalid Last Name and having More or less than 3 Characters");

        }
        return lastname.matches(nameRegex);
    }
//UC-3 As a User need to enter

    //  a valid email//- E.g. abc.xyz@bl.co.in -
    //  Email has 3 mandatory parts (abc, bl& co) and
    //  2 optional (xyz & in) with precise @ and . positions
    public boolean emailID(String emailID) throws CustomExceptions {
        String emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        if (emailID.matches(emailRegex)) {
            System.out.println("Valid Email ID is" + " " + emailID);

        } else {
            throw new CustomExceptions("Invalid emailID ");

        }
        return emailID.matches(emailRegex);
    }

    public boolean phoneNumber(String phoneNumber) throws CustomExceptions {
        String PhoneNumberRegex = "^(\\d{2}[- ]?){3}\\d{6}$";
        phoneNumber.matches(PhoneNumberRegex);

        if (phoneNumber.matches(PhoneNumberRegex)) {
            System.out.println("Valid Phone Number" + phoneNumber);
        } else {
            throw new CustomExceptions("Invalid Phone Number");
        }


        return (phoneNumber.matches(PhoneNumberRegex));
    }

    public static void main(String[] args) {
        UserRegistrationProblemUC1 myFirstname = new UserRegistrationProblemUC1();

        try {
            System.out.println(myFirstname.firstName("To"));
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(myFirstname);
        }

        UserRegistrationProblemUC2 myLastname = new UserRegistrationProblemUC2();

        try {
            System.out.println(myLastname.lastName("Be"));
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(myLastname);
        }
        UserRegistrationProblemUC3 myEmailID = new UserRegistrationProblemUC3();

        try {
            System.out.println(myEmailID.emailID("Max.123@gmail.com"));
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(myEmailID);
        }
        UserRegistrationProblemUC1 myPhoneNumber = new UserRegistrationProblemUC1();
        try {
            System.out.println(myPhoneNumber.phoneNumber("91@9695795786"));
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(myPhoneNumber);
        }
    }
}