package com.solution8;

import java.util.stream.IntStream;
import java.util.stream.Stream;
/*8. Create an IntStream to represent numbers from 1 to 10. 
 * Call various functions like sum(), summaryStatistics() and observe the output.*/
public class Sol8 {
	public static void main(String[] args) {
		
	
IntStream str1=IntStream.range(1, 10);
int total=str1.sum();
System.out.println(total);

IntStream str2=IntStream.range(1, 10);
System.out.println(str2.summaryStatistics());

}
	}
