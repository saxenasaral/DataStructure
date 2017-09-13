package com.saral.training.array.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeArray {

	static void mergeArray(){
		
		int[] arr1={2,3,4,5,7,9};
		int[] arr2={1,3,4,5};
		int[] arr3={2,3,4,9,10};
		System.out.println("convert to integer");
		Integer [] ar1 = new Integer[arr1.length];
		ar1= convert(arr1, ar1);

		Integer [] ar2 = new Integer[arr2.length];
		ar2= convert(arr2, ar2);
		
		Integer [] ar3 = new Integer[arr3.length];
		ar3= convert(arr3, ar3);
		
		System.out.println("initial list"+Arrays.toString(ar1));
		List<Integer> l1= new ArrayList<Integer>(Arrays.asList(ar1));
		l1.addAll(Arrays.asList(ar2));
		l1.addAll(Arrays.asList(ar3));
	
		Collections.sort(l1);
		System.out.println(l1);
	}
	
	static Integer[] convert(int[] ar,Integer[] ari){
		
		for(int i=0;i<ar.length;i++){
			ari[i]=Integer.valueOf(ar[i]);
		}
		
		
		return ari;
	}
	
	public static void main(String[] args) {

		mergeArray();
	}

}
