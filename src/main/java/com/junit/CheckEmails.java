package com.junit;

import java.util.regex.Pattern;

public class CheckEmails {
        public boolean emailSamples(String email){
            boolean status = Pattern.compile("[a-z]{3,}[-.+]{0,1}[10]{0,3}[@]{1}[10]{0,3}[a-z]{0,5}[.]{0,1}[a-z]{0,3}[,.]{0,1}[a-z]{0,3}").matcher(email).matches();
            return status;
    }
}
