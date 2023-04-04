package com.greatlearning.lab2_ii;

import java.util.Arrays;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Total Number of Currency Notes in Your Country");
		int size = sc.nextInt();

		int[] currency = new int[size];

		System.out.println("Enter The Denominations");
		for (int i = 0; i < size; i++) {
			
			currency[i] = sc.nextInt();
		}
		System.out.println("Before Soring The Currency"+Arrays.toString(currency));
		MergeSort ms= new MergeSort();
		ms.sort(currency, 0, size-1);
		System.out.println("After Soring The Currency"+Arrays.toString(currency));
		
		System.out.println("\nEnter The Amount to Check Note Count");
		int amount= sc.nextInt();
		NoteCount nc= new NoteCount();
		nc.counting(currency,amount);
	}

}
