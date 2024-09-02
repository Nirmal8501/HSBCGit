package com.hsbc.exceptions;

public class StudentDoesNotExistException extends Exception{
    public StudentDoesNotExistException(){

    }

    public StudentDoesNotExistException(String message) {
        super(message);
    }

    public StudentDoesNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentDoesNotExistException(Throwable cause) {
        super(cause);
    }

    public StudentDoesNotExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
