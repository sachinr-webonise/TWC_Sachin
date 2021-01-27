package coding_practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class passwordGenerator {

	// TODO Auto-generated method stub

	private static final String nameRegex = "^[\\p{L} .'-]+$";
	private static final String nameRegexInt = "[0-2]{2}[0] {}";
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = checkValidName(sc);
		String year = year(sc);
		String petName = petName(sc);
		List<String> password = Arrays.asList(name, year, petName);
		Collections.shuffle(password);
		System.out.println(password.get(0) + "" + password.get(1) + "" + password.get(2));

	}

	public static String checkValidName(Scanner sc) {
		System.out.print("Enter name");
		String name = sc.nextLine();

		if (!name.matches(nameRegex)) {
			System.out.println("enter valid name");
			checkValidName(sc);

		}
		return name;

	}

	public static String year(Scanner sc) {

		System.out.println("Enter date of year");
		String year = sc.nextLine();
		if (Integer.parseInt(year)>2021 &&Integer.parseInt(year)<0) {
			
			System.out.println("enter valid year");
			year(sc);
		}
		return year;

	}

	public static String petName(Scanner sc) {
		String petName = null;
		System.out.println("Do you have pet");
		String answer = sc.nextLine();
		if (answer.equalsIgnoreCase("yes")) {
			System.out.println("write your pet's name");
			petName = sc.nextLine();

		} else if (answer.equalsIgnoreCase("no")) {

			petName=carName(sc, petName);

		} else {
			petName(sc);
		}
		return petName;

	}

	public static String carName(Scanner sc, String petName) {

		System.out.println("Do you have a car");
		String answer1 = sc.nextLine();
		if (answer1.equalsIgnoreCase("yes")) {

			System.out.println("please type your car brand name");
			petName = sc.nextLine();

		} else if (answer1.equalsIgnoreCase("no")) {
			System.out.println("type your city name");
			petName = sc.nextLine();

		}
		else {
			carName(sc,petName);
		}
		return petName;

	}

}
