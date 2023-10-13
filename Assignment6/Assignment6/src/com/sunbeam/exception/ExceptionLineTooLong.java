package com.sunbeam.exception;

public class ExceptionLineTooLong extends RuntimeException {
	public void display() {
		System.out.println("Line too long");
	}
}
