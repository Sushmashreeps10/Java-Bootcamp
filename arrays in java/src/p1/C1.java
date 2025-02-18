package p1;

import java.util.Arrays;

public class C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("hello world");
		
//		arrays
		
		int[] listof_arrays = {1,2,3,4,5,6,7,8,8,9};
		System.out.println(Arrays.toString(listof_arrays));
		
		int i = 0;
		while (i < 1) {
			System.out.println(listof_arrays[i]);
			i++;
			
		}
		
//		for loops
		for (int index = 0; index < 5; index++) {
		System.out.println(listof_arrays[index]);
		}
		
		for (int elements : listof_arrays) {
			System.out.println(elements);
		}
		
//		to calculate length
		String str = "hello WORLD";
		int forlen = str.length();
		System.out.println(forlen);
		
//		to lowercase
		String lowercase = str.toLowerCase();
		System.out.println(lowercase);
		
//		to replace
		String rplace = str.replace('h', 's');
		System.out.println(rplace);
		
		String uppercase = str.toUpperCase();
		System.out.println(uppercase);
		
		
		
	}

}
