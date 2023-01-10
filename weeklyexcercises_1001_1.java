
public class weeklyexcercises_1001_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, square, cube;

		System.out.println("Number		Square		Cube");

		for (int i = 1; i < 11; i++) {

			number = i;

			square = i * i;

			cube = i * i * i;

			System.out.println(number + "		" + square + "		" + cube);

		}

	}

}

/*
 * 2. Write a Java program to calculate and tabulate the square and cube of
 * integers 1 to 10. The output should look like:
 * 
 * Number Square Cube 1 1 1 2 4 8 3 9 27 4 16 64 5 25 125 6 36 216 7 49 343 8 64
 * 512 9 81 729 10 100 1000
 */