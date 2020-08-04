package com.acm.library.globals.exceptions;

public class InvalidPasswordException extends Exception
{
    private static final long serialVersionUID = -1L;
    public InvalidPasswordException()
    {
        super("Entered password is incorrect. Please try again.");
    }
}
