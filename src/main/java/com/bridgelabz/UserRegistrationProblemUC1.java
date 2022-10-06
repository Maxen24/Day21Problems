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


        public static void main (String[]args){
        UserRegistrationProblemUC1 myFirstname=new UserRegistrationProblemUC1();

            try {
                System.out.println(myFirstname.firstName("To"));
            } catch (Exception e) {
                System.out.println(e);
                System.out.println(myFirstname);
            }
            UserRegistrationProblemUC2 myLastname=new UserRegistrationProblemUC2();

            try {
                System.out.println(myLastname.lastName("Be"));
            } catch (Exception e) {
                System.out.println(e);
                System.out.println(myLastname);
            }
        }
    }