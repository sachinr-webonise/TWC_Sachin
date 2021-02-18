package coding_practice;

import java.io.IOException;
import java.util.Scanner;

public class jackpot extends validations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int user_age = ageValidation();
		guessVal(user_age);
	}
}
