package com.epam.izh.rd.online.exception;

public class NotAccessException extends Exception {
    public NotAccessException() {
        super();
    }

    public NotAccessException(String s) {
        super(s);
    }

    public NotAccessException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public NotAccessException(Throwable throwable) {
        super(throwable);
    }
}
