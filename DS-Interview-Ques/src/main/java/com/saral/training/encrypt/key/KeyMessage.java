package com.saral.training.encrypt.key;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KeyMessage {

	static String messaging(int operation, String key, String message){
		
		
		if(operation==1){
			//encryption
			StringBuilder sb = new StringBuilder();
			int ke = (int)Integer.valueOf(key);
			int temp=ke;
			List<Integer> list = new ArrayList<Integer>();
			do{
				list.add(temp%10);
				temp=temp/10;
			}while(temp>0);
			Collections.reverse(list);
			
			char [] c=message.toCharArray();
			
			for(int i=0;i<c.length;i++){
				if(i<list.size()){
					for(int j=0;j<list.get(i);j++){
						sb.append(c[i]);
					
					}
				}else{
				sb.append(c[i]);
				}
			}
			System.out.println(" sb ");
			return sb.toString();
		}else{
			//encryption
			StringBuilder sb = new StringBuilder();
			int ke = (int)Integer.valueOf(key);
			int temp=ke;
			List<Integer> list = new ArrayList<Integer>();
			do{
				list.add(temp%10);
				temp=temp/10;
			}while(temp>0);
			Collections.reverse(list);
			
			char [] c=message.toCharArray();
			int index=0;
			
			for(int i=0;i<list.size();i++){
				index=index+(list.get(i));
				sb.append(c[index-1]);
			}
			
			
			
			for(int i=index;i<c.length;i++){
				sb.append(c[i]);
			}
			
			System.out.println(" sb ");
			return sb.toString();
		}
	}

	public static void main(String[] args) {

		System.out.println(messaging(1, "123456", "open"));
		System.out.println(messaging(2, "123", "oppeeened"));
	}

}
