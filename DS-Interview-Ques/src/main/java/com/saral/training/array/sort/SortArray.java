package com.saral.training.array.sort;

import java.util.Arrays;
import java.util.Collections;

import com.saral.training.array.merge.User;

public class SortArray {
	
	private  int a;
	

	public static void main(String[] args) {

		int []arr1={2,1,4,3,7,5,8,4};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
	
		int []arr2={2,1,4,3,7,5,8,4};
		Arrays.sort(arr2,0,5);
		System.out.println(Arrays.toString(arr2));
	
		Integer[] arr3={2,1,4,3,7,5,8,4};
		
		System.out.println(Arrays.toString(arr2));
		
		// Note that we have Integer here instead of
        // int[] as Collections.reverseOrder doesn't
        // work for primitive types.
        Integer[] arr = {13, 7, 6, 45, 21, 9, 2, 100};
 
        // Sorts arr[] in descending order
        Arrays.sort(arr, Collections.reverseOrder());
 
        System.out.printf("Modified arr[] : %s",
                          Arrays.toString(arr));
        
        SortArray SortArray = new SortArray();
        SortArray.a=10;
        System.out.println(SortArray.a);
        SortArray.a=13;
		System.out.println(SortArray.a);
		
		User [] userAr = {new User(111, "bbbb", "london"),
                new User(131, "aaaa", "nyc"),
                new User(121, "cccc", "jaipur")};

		
		Arrays.sort(userAr, new SortArrayComparator());
		for(int i=0;i<userAr.length;i++){
			System.out.println(userAr[i].toString());
		}
		
		
	}

}
