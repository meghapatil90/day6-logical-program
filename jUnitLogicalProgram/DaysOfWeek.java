package jUnitLogicalProgram;

import java.util.Scanner;

public class DaysOfWeek {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int day, month, year, d1;

		System.out.println("Enter Day: ");
		day = scanner.nextInt();
		System.out.println("Enter Month: ");
		month = scanner.nextInt();
		System.out.println("Enter Year: ");
		year = scanner.nextInt();

		DaysOfWeek dd = new DaysOfWeek();
		d1 = dd.calculateDayOfWeek(day, month, year);

		switch (d1) {
		case 0:
			System.out.println("Day is Sunday");
			break;
		case 1:
			System.out.println("Day is Monday");
			break;
		case 2:
			System.out.println("Day is Tuesday");
			break;
		case 3:
			System.out.println("Day is Wednesday");
			break;
		case 4:
			System.out.println("Day is Thursday");
			break;
		case 5:	
			System.out.println("Day is Friday");
			break;
		case 6:
			System.out.println("Day is Saturday");
			break;
		}
		scanner.close();
	}

	public int calculateDayOfWeek(int day, int month, int year) {
		int y1, x, m, d1;
		y1 = year - (14 - month) / 12;
		x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
		m = month + 12 * ((14 - month) / 12) - 2;
		d1 = (day + x + 31 * m / 12) % 7;
		return d1;
	}
}
