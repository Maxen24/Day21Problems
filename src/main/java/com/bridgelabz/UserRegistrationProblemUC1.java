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

    //UC-5 As a User need to follow pre-defined Password rules.
    //Rule1– minimum 8 Characters - NOTE – All rules must be passed
    public boolean passWord(String password) throws Exception {
        String passwordRegex = "[a-z]{8}";

        if (password.matches(passwordRegex)) {
            System.out.println("Valid Password" + password);
        } else {
            throw new CustomExceptions("Invalid Password");
        }
        return password.matches(passwordRegex);
    }

    // UC-6 Should have at least 1
    ///Upper Case - NOTE – All rules must be passed
    public boolean passwordRule2(String passwordRule2) throws CustomExceptions {
        String passwordRuleRegex = "^(?=.*?[A-Z])[a-zA-Z]{8}";
        if (passwordRule2.matches(passwordRuleRegex)) {
            System.out.println("Valid Password" + passwordRule2);
        }else{
            throw new CustomExceptions("Invalid Password without uppercase");
        }
        return passwordRule2.matches(passwordRuleRegex);
    }
    //UC7 Rule3– Should have at least 1 numeric number in
    //the password - NOTE – All rules must be passed
    public boolean passwordRule3(String passwordRule3)throws CustomExceptions {
        String passwordRule3Regex = "^(?=.*?[A-Z])[a-zA-Z]{8}[0-9]{1}";

        if (passwordRule3.matches(passwordRule3Regex)) {
            System.out.println("Valid PassWord" + passwordRule3);
        } else {
            throw new CustomExceptions("Invalid Password without Numeric Digit");
        }
        return passwordRule3.matches(passwordRule3Regex);
    }

    // UC-8 Rule4 – Has exactly 1 Special Character - NOTE – All rules must be passed
    public boolean passwordRule4(String passwordRule4) throws CustomExceptions {
        String passwordRule4Regex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";

        if (passwordRule4.matches(passwordRule4Regex)){
            System.out.println("Valid Password" +passwordRule4);
        }else{
            throw new CustomExceptions("Invalid Password without Special digit");
        }
        return passwordRule4.matches(passwordRule4Regex);

    }

        public static void main (String[]args){
            UserRegistrationProblemUC1 myFirstname = new UserRegistrationProblemUC1();

            try {
                System.out.println(myFirstname.firstName("To"));
            } catch (Exception e) {
                System.out.println(e);
            }

            UserRegistrationProblemUC1 myLastname = new UserRegistrationProblemUC1();

            try {
                System.out.println(myLastname.lastName("Be"));
            } catch (Exception e) {
                System.out.println(e);
            }
            UserRegistrationProblemUC1 myEmailID = new UserRegistrationProblemUC1();

            try {
                System.out.println(myEmailID.emailID("Max.123@gmail.com"));
            } catch (Exception e) {
                System.out.println(e);
            }
            UserRegistrationProblemUC1 myPhoneNumber = new UserRegistrationProblemUC1();
            try {
                System.out.println(myPhoneNumber.phoneNumber("91@9695795786"));
            } catch (Exception e) {
                System.out.println(e);
            }
            UserRegistrationProblemUC1 myPassword = new UserRegistrationProblemUC1();
            try {
                System.out.println(myPassword.passWord("valAdiate"));
            } catch (Exception e) {
                System.out.println(e);
            }
            UserRegistrationProblemUC1 myPasswordRule2=new UserRegistrationProblemUC1();
            try{
                System.out.println(myPasswordRule2.passwordRule2("123date"));
            }catch (Exception e){
                System.out.println(e);
            }
            UserRegistrationProblemUC1 myPasswordRule3=new UserRegistrationProblemUC1();
            try{
                System.out.println(myPasswordRule3.passwordRule3("validate@"));
            }catch(Exception e){
                System.out.println(e);
            }
            UserRegistrationProblemUC1 myPasswordRule4=new UserRegistrationProblemUC1();
            try{
                System.out.println(myPasswordRule4.passwordRule4("validate"));
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

