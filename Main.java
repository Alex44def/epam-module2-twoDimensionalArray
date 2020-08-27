package ru.epam.jonline.module2.d2_array;

public class Main {

	public static void main(String[] args) {

		System.out.println("Algorithmization.  Массивы массивов");

		int[][] arr11 = new int[][] { { 1, 7, 9, 4, 5 }, { 5, 6, 7, 8, 6 }, { 9, 3, 5, 2, 1 }, { 2, 5, 7, 1, 1 },
				{ 1, 6, 7, 8, 4 } };
		int[][] arr22 = new int[][] { { 1, 7, 9, 4, 5 }, { 5, 6, -7, 8, 6 }, { 9, 3, 5, 2, 1 }, { 2, 5, 7, 1, 1 },
				{ 1, 6, -7, 8, 4 } };

		TwoDimensionalArray.firstTask(arr11);
		TwoDimensionalArray.secondTask(arr11);
		TwoDimensionalArray.thirdTask(arr11, 3, 4);
		TwoDimensionalArray.fourthTask(6);
		TwoDimensionalArray.fifthTask(6);
		TwoDimensionalArray.sixthTask(6);
		TwoDimensionalArray.seventhTask(6);
		TwoDimensionalArray.eighthTask(arr11);
		TwoDimensionalArray.ninthTask(arr11);
		TwoDimensionalArray.tenthTask(arr22);
		TwoDimensionalArray.eleventhTask();
		TwoDimensionalArray.twelfthTask(arr11);
		TwoDimensionalArray.thirteenthTask(arr11);
		TwoDimensionalArray.fourteenthTask(8, 4);
		TwoDimensionalArray.fifteenthTask(arr11);
		TwoDimensionalArray.sixteenthTask();

	}

}
