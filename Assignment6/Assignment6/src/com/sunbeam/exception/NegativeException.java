package com.sunbeam.exception;

public class NegativeException extends RuntimeException{
public void display() {
	System.out.println("the diameter should be non-negative");
}
}
