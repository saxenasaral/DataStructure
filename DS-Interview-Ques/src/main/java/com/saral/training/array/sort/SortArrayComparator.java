package com.saral.training.array.sort;

import java.util.Comparator;

import com.saral.training.array.merge.User;

public class SortArrayComparator implements Comparator<User> {

	public int compare(User o1, User o2) {
		
		return o1.getId()-o2.getId();
	}

}
