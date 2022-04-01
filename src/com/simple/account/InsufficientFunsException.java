package com.simple.account;

public class InsufficientFunsException extends Exception{
    public InsufficientFunsException() {
    }

    public InsufficientFunsException(String message) {
        super(message);
    }

    public InsufficientFunsException(String message, Throwable cause) {
        super(message, cause);
    }

    public InsufficientFunsException(Throwable cause) {
        super(cause);
    }

    public InsufficientFunsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
