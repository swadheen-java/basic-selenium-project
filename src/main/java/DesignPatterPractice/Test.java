package DesignPatterPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		List<Integer> intList = new ArrayList<Integer>();
		for(int i=0;i<20;i++) {
			intList.add(rand.nextInt(50)*10);
		}
		
		Iterator iterator = intList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("+++++++++++++++++++++++++");
		
		intList.stream().forEach(a -> System.out.println(a/10));
		
	
		
	
	}
}
