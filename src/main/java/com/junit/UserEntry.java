package com.junit;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserEntry {
    //public void userDetails(){
        Scanner scanner = new Scanner(System.in);
        public boolean firstName(String firstname) {
            boolean result = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(firstname).matches();
            if (result == true) {
                return true;
            } else {
                return false;
            }
        }
        public boolean lastName(String lastname) {
            boolean result1 = Pattern.compile("[A-Z]{1}[a-z]{2,}").matcher(lastname).matches();
            if (result1 == true) {
                return true;
            } else {
                return false;
            }
        }
        public boolean userEmail(String mail){
            boolean result2 = Pattern.compile("[[a-z]+[.][a-z]]+[@][a-z]+[.][a-z]+[.][a-z]{2,}").matcher(mail).matches();
          if (result2==true){
              return true;
          }
          else {
              return false;
          }
        }
        public boolean phoneNumber(String number){
            boolean result3 = Pattern.compile("[0-9]{2,} [0-9]{10}").matcher(number).matches();
            if (result3==true){
                return true;
            }
            else {
                return false;
            }
        }
        public boolean userPassword(String password){
            boolean result4 = Pattern.compile("^(?=.*[A-Z]).{8,}$").matcher(password).matches();
            if (result4==true){
                return true;
            }
            else {
                return false;
            }
        }
  }

