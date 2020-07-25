package com.epam.java8;

import java.util.Scanner;
public class App {

    public static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter no. of elements:");
			int n = sc.nextInt();
			int[] list = new int[n];
			System.out.println("Enter elements:");
			for(int i=0;i<n;i++) {
				list[i]=sc.nextInt();
			}
			avgInt obj = new avgInt();
			System.out.println(obj.Average(list));
		}
    }
}