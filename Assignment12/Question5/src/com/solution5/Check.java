package com.solution5;

@FunctionalInterface
public interface Check <T>{
	boolean compare(T x, T y);
}