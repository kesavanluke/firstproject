package org.company;

public class test {

	public static void main(String[] args) {
		int a[] = {12,123,1234,12355,1234,76,65,4,7654,6543,54};
		System.out.println(a.length);
		int[] clone = a.clone();
		System.out.println(clone);
		boolean equals = a.equals(clone);
		System.out.println(equals);
		int hashCode = a.hashCode();
		System.out.println(hashCode);
	}

}
