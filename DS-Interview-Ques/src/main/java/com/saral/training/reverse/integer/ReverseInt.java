package com.saral.training.reverse.integer;

import java.util.Arrays;

public class ReverseInt {
	
	static int reverse(Integer n){
		int rev=0;
		int[] arr=new int[(int)Math.log10(n)+1];
		int temp=n;
		int i=0;
		do{
			arr[i]=temp%10;
			i++;
			temp /=10;
		}while(temp>0);
		System.out.println(Arrays.toString(arr));
		
		for(int j=0;j<arr.length;j++){
			rev=(int) (rev+Math.pow(10,j)*arr[arr.length-j-1]);
		}
		System.out.println(rev);
		return rev;
	}

	public static void main(String[] args) {

		System.out.println(reverse(1234));
		
		
	}

}
