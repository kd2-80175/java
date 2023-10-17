package com.book;
import java.util.*;
class Arrsort implements Comparator<Double>{

	@Override
	public int compare(Double d1, Double d2) {
		// TODO Auto-generated method stub
		if(d1.doubleValue()==d2.doubleValue())
		return 0;
		if(d1.doubleValue()>d2.doubleValue())
			return 1;
		
		return -1;
	}
	
}
public class Sort {
static<T> void selectionSort() {
	
}
}
