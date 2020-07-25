package com.epam.java8;

import java.util.Arrays;
public class avgInt{
	

	public double Average(int[] list) {
		// TODO Auto-generated method stub
		return Arrays.stream(list).mapToDouble(i -> (double)i).average().getAsDouble();
	}
}