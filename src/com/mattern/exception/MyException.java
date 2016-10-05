package com.mattern.exception;

/**
 * @author smattern on 05/10/16.
 */
public class MyException extends Exception {
    public MyException () {

    }

    public MyException (String message) {
        super (message);
    }

    public MyException (Throwable cause) {
        super (cause);
    }

    public MyException (String message, Throwable cause) {
        super (message, cause);
    }
}
