package com.myexception;

public abstract class ApplicationException extends RuntimeException {

public ApplicationException(String msg) {
	super(msg);
}
}
