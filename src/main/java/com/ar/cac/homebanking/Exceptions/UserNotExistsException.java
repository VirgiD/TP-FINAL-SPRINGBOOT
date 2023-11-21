package com.ar.cac.homebanking.Exceptions;

public class UserNotExistsException extends  RuntimeException{
    public UserNotExistsException(String message){
        super(message);
    }
}
