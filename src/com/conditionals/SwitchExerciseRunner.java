package com.conditionals;



public class SwitchExerciseRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(determineNameOfDay(9));
		System.out.println(isWeekday(5));
	}

	/*
	 * PROBLEM STATEMENT-Determine name of the day- # input-number of day 0(Sunday)
	 * to 6 (Saturday) # Return the name of the day in text
	 */
	public static String determineNameOfDay(int dayNumber) {
//if we use return then we dont need to use break, if we are directly sending result in return. As on return the next line is not exceuted
		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";

		}
		return "Invalid";

	}

	/*
	 * PROBLEM STATEMENT-Determine name of the day- # input-number of day 0(Sunday)
	 * to 6 (Saturday) # Return the name of the day in text
	 */
	public static boolean isWeekday(int dayNumber) {

		switch (dayNumber) {
		case 0:
		case 6:
			return false; // we can optimize code and can use fall through process. We can also comment
							// out these false cases as we are already returning False in the end of the
							// method
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			return true;

		}

		return false;

	}

}
