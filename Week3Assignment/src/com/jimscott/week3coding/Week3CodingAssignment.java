package com.jimscott.week3coding;

import java.util.Arrays;

public class Week3CodingAssignment {

	public static void main(String[] args) {
		
//		1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
//		a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). 
//			Print the result to the console.
//		b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
//		c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.

		int [] ages = {3,9,23,64,2,8,28,93,78};
		
		int first = ages[0];
		int last = ages[ages.length - 1];
		System.out.println(last - first);
		System.out.println(sumOfAges(ages));
		
		int average = sumOfAges(ages)/ages.length;
		System.out.println(average);
		
//		2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
//		a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
//		b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.

		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		int sumLetters = 0;
		for (String name : names) {
			sumLetters += name.length();
		}
		int average1 = sumLetters / names.length;
		System.out.println(average1);
		
		String namesList = "";
		for (String name : names) {
			namesList += name + " ";
		}
		System.out.println(namesList);	
		
//		5.	Create a new array of int called nameLengths.
//		Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		
		int count = (names.length);
		int[] nameLengths = new int[count];
		for (int i = 0; i < count; i++) {
			nameLengths[i] = names[i].length();
		}
		
//		6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int sumElements = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sumElements += nameLengths[i];
		}
		System.out.println(sumElements);
		
//		7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated 
//		to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
		
		System.out.println(multiplyString("Hello", 3));
		
//		8.	Write a method that takes two Strings, firstName and lastName, and returns a full name 
//		(the full name should be the first and the last name as a String separated by a space).
		
		String firstName = "Jim";
		String lastName = "Scott";
		String fullName = createFullName(firstName, lastName);
		System.out.println(fullName);
		
//		9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		
		System.out.println(checkIfGreaterThan100(ages));
		
//		10.	Write a method that takes an array of double and returns the average of all the elements in the array.
		
		double[] doubleArr = {0.9, 7.0, 154.87, 725.77};
		double[] emptyDoubleArr = {};
		System.out.println(getAverageOfDoubleArr(doubleArr));
		System.out.println(getAverageOfDoubleArr(emptyDoubleArr));
		
//		11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is 
//		greater than the average of the elements in the second array.
		
		double[] avg2DoubleArray = {2.2, 3.3, 4.4, 5.5};
		System.out.println(isFirstArrAvgGreater(doubleArr, avg2DoubleArray));
		
//		12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
//		and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		
		boolean isItHot = true; 
		double money = 17.89;
		System.out.println(willBuyDrink(isItHot, money));
		
//		13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		
		//Method used to calculate the average of an array of grades for a final grade
		double[] grades = new double[5];
		grades[0] = 78.6;
		grades[1] = 99.5;
		grades[2] = 64.3;
		grades[3] = 82.7;
		grades[4] = 98.3;
		
		System.out.println(calculateAverage(grades));
		
	}
	public static double calculateAverage(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}
	static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && (moneyInPocket > 10.50)) {
			return true;
		} else {
			return false;
		}
	}
	private static boolean isFirstArrAvgGreater(double[] firstArr, double[] secondArr) {
		return getAverageOfDoubleArr(firstArr) > getAverageOfDoubleArr(secondArr); 
	}
	private static double getAverageOfDoubleArr(double[] arr) {
		return Arrays.stream(arr).average().orElse(Double.NaN); 
	}
	private static Boolean checkIfGreaterThan100(int[] arr) {
		return Arrays.stream(arr).sum() > 100;
	}
	public static String createFullName(String x, String y) {
		String fullName = x + " " + y;
		return fullName;
	}
	public static String multiplyString(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str;
		}
		return result; 
	}
	public static int sumOfAges(int[] averageAge) {
		int sum = 0;
		for (int age : averageAge) {
			sum += age;
		}
		return sum;
		
	
	}

}
