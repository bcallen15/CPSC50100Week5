//********************************************************
//	UserStrings.java			Author: Ben Callen
//
//	Reads strings input by a user and outputs them to 
//	a file called userString.txt. The program ends when
//	DONE is entered.
//********************************************************

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UserStrings {

	public static void main(String[] args) throws IOException {
		
		String userStrings;
		
		FileWriter fw = new FileWriter("userStrings.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter strings. To finish, type DONE.");
		
		while (!input.equals("DONE")) {
			userStrings = input.nextLine();
				outFile.print(userStrings + " ");
				outFile.println();

		}
		outFile.close();

		System.out.println("File has been created. " + outFile);
	}
}

