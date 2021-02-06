package com.example.devcon.exception;

import org.springframework.mail.MailException;

public class SpringDevConException extends RuntimeException {
    public SpringDevConException(String exMsg, Exception e) {
        super(exMsg, e);
    }
    public SpringDevConException(String exMsg){
        super(exMsg);
    }
}
