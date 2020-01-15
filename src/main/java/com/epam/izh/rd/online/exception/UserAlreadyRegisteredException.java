package com.epam.izh.rd.online.exception;

public class UserAlreadyRegisteredException extends RuntimeException {
    public UserAlreadyRegisteredException() {
        super();
    }

    public UserAlreadyRegisteredException(String s) {
        super(s);
    }

    public UserAlreadyRegisteredException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public UserAlreadyRegisteredException(Throwable throwable) {
        super(throwable);
    }
}
