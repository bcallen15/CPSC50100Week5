//********************************************************
//	MaxValues.java			Author: Ben Callen
//
//	Reads a CSV file and outputs the maximum value from
//	each row.
//********************************************************

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class MaxValues {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner csv = new Scanner(new File("input.csv.txt")); //imports csv file
		
		String row = "";
		
		int max = 0, count=1; //initializes the maximum value to zero for comparison, and the count for the rows to 1
		
		String[]arr;
		
		System.out.println("Maximum values:");
		
		while (csv.hasNext()) {
			row = csv.nextLine();
			arr = row.split(","); //splits values that surround the ","
			for (int i = 0; i<arr.length; i++) {
				if (Integer.parseInt(arr[i]) > max) { //should change String value made in array to int value
					max = Integer.parseInt(arr[i]);
				}
				System.out.println("ROW" + count + ":" + max);
				count++;
			}
		}
	}

}