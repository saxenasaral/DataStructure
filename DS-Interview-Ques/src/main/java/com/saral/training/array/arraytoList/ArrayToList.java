package com.saral.training.array.arraytoList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	
	public static void main(String[] args) {

		Integer [] arr = {2,4,5,7,5};
		
		List ll = new ArrayList();
		ll.addAll(Arrays.asList(arr));
		
		System.out.println(ll.toString());
	}

}
