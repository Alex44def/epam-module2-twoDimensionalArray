package ru.epam.jonline.module2.d2_array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {

//	Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего

	public static void firstTask(int[][] arr) {
		System.out.println("Answer firstTask: ");
		printIntArray(arr);

		int l = arr.length;
		int c = 0;
		int[] numCol = new int[arr.length / 2];

		for (int i = 0; i < arr.length; i += 2) {
			if (arr[0][i] > arr[l - 1][i]) {
				numCol[c++] = i;
			}
		}

		for (int[] intValues : arr) {
			for (int j = 0; j < c; j++) {
				System.out.print(intValues[numCol[j]] + " ");
			}
			System.out.println();
		}
	}

//	Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали

	public static void secondTask(int[][] arr) {
		System.out.println("Answer secondTask: ");
		printIntArray(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][i] + " ");
		}

		System.out.println();
	}

//    Дана матрица. Вывести k-ю строку и p-й столбец матрицы

	public static void thirdTask(int[][] arr, int k, int p) {
		System.out.println("Answer thirdTask: ");
		printIntArray(arr);

		for (int elem : arr[k - 1]) {
			System.out.print(elem + " ");
		}

		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][p - 1]);
		}
	}

//    Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

	public static void fourthTask(int n) {
		System.out.println("Answer fourthTask: ");

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i % 2 != 0)) {
					arr[i][j] = n - j;
				} else {
					arr[i][j] = j + 1;
				}
			}
		}

		printIntArray(arr);
	}

//    Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

	public static void fifthTask(int n) {
		System.out.println("Answer fifthTask: ");

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((j >= arr.length - i)) {
					arr[i][j] = 0;
				} else {
					arr[i][j] = i + 1;
				}
			}
		}

		printIntArray(arr);
	}

//    Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

	public static void sixthTask(int n) {
		System.out.println("Answer sixthTask: ");

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i < n / 2) {
					if (i > j || j >= arr.length - i) {
						arr[i][j] = 0;
					} else {
						arr[i][j] = 1;
					}
				} else {
					if (i <= j - 1 || j < arr.length - i - 1) {
						arr[i][j] = 0;
					} else {
						arr[i][j] = 1;
					}
				}
			}
		}

		printIntArray(arr);
	}

//    Сформировать квадратную матрицу порядка N по правилу и подсчитать количество положительных элементов в ней

	public static void seventhTask(int n) {
		System.out.println("Answer seventhTask: ");

		double[][] arr = new double[n][n];
		int count = 0;
		double x;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				x = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
				arr[i][j] = Math.ceil(x * 1000) / 1000;
				if (x >= 0) {
					count++;
				}
			}
		}

		printDoubleArray(arr);
		System.out.println("Положительных элементов: " + count);
	}

//    В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//    на соответствующие им позиции другого, а его элементы второго переместить в первый. 
//    Номера столбцов вводит пользователь с клавиатуры

	public static void eighthTask(int[][] arr) {
		System.out.println("Answer eighthTask: ");
		printIntArray(arr);

		int n;
		int m;

		m = enterIntValueFromConsole("Введите номер первого столбца: ");
		m--;
		n = enterIntValueFromConsole("Введите номер второго столбца: ");
		n--;

		int x;
		for (int i = 0; i < arr.length; i++) {
			x = arr[i][n];
			arr[i][n] = arr[i][m];
			arr[i][m] = x;
		}

		printIntArray(arr);
	}

//    Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. 
//    Определить, какой столбец содержит максимальную сумму

	public static void ninthTask(int[][] arr) {
		System.out.println("Answer ninthTask: ");
		printIntArray(arr);

		int[] sum = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum[j] = sum[j] + arr[i][j];
			}
		}

		int maxSum = sum[0];

		for (int e : sum) {
			if (e > maxSum) {
				maxSum = e;
			}
		}

		System.out.println("Суммы столбцов: " + Arrays.toString(sum));
		System.out.println("Max sum: " + maxSum);
	}

//    Найти положительные элементы главной диагонали квадратной матрицы

	public static void tenthTask(int[][] arr) {
		System.out.println("Answer tenthTask: ");
		printIntArray(arr);

		System.out.println("Положительные элементы главной диагонали: ");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i][i] >= 0) {
				System.out.print(arr[i][i] + " ");
			}
		}
		System.out.println();
	}

//    Матрицу 10x20 заполнить случайными числами от 0 до 15. 
//    Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз

	public static void eleventhTask() {
		System.out.println("Answer eleventhTask: ");

		int[][] arr = new int[10][20];
		int[] countArr = new int[10];
		int count;

		for (int i = 0; i < 10; i++) {
			count = 0;
			for (int j = 0; j < 20; j++) {
				arr[i][j] = (int) (Math.random() * 16);
				if (arr[i][j] == 5) {
					count++;
				}
			}
			if (count >= 3) {
				countArr[i] = count;
			}
		}

		printIntArray(arr);

		for (int i = 0; i < countArr.length; i++) {
			if (countArr[i] > 0) {
				System.out.println("В строке № " + (i + 1) + " число 5 встречается " + countArr[i] + " раз(а)");
			}
		}
	}

//    Отсортировать строки матрицы по возрастанию и убыванию значений элементов

	public static void twelfthTask(int[][] arr) {
		System.out.println("Answer twelfthTask: ");
		printIntArray(arr);

		for (int i = 0; i < arr.length; i++) {
			arraySortByIncrease(arr[i]);
		}

		System.out.println("Сортировка строк по возрастанию");
		printIntArray(arr);

		for (int i = 0; i < arr.length; i++) {
			arraySortByDecrease(arr[i]);
		}

		System.out.println("Сортировка строк по убыванию");
		printIntArray(arr);
	}

//    Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов

	public static void thirteenthTask(int[][] arr) {
		System.out.println("Answer thirteenthTask: ");
		printIntArray(arr);

		int[] tempArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				tempArr[j] = arr[j][i];
			}

			arraySortByIncrease(tempArr);

			for (int j = 0; j < arr.length; j++) {
				arr[j][i] = tempArr[j];
			}
		}

		System.out.println("Сортировка столбцов по возрастанию");
		printIntArray(arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				tempArr[j] = arr[j][i];
			}

			arraySortByDecrease(tempArr);

			for (int j = 0; j < arr.length; j++) {
				arr[j][i] = tempArr[j];
			}
		}

		System.out.println("Сортировка столбцов по убыванию");
		printIntArray(arr);
	}

//    Сформировать случайную матрицу m x n, состоящую из нулей и единиц, 
//    причем в каждом столбце число единиц равно номеру столбца

	public static void fourteenthTask(int m, int n) {
		System.out.println("Answer fourteenthTask: ");

		int[][] arr = new int[m][n];
		int[] countArr = new int[n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (countArr[j] < j + 1) {
					arr[i][j] = (Math.random() > 0.5 ? 1 : 0);
					if (arr[i][j] == 1) {
						countArr[j]++;
					}
				} else {
					arr[i][j] = 0;
				}
			}
		}

		printIntArray(arr);
	}

//    Найдите наибольший элемент матрицы и заменить все нечетные элементы на него

	public static void fifteenthTask(int[][] arr) {
		System.out.println("Answer fifteenthTask: ");
		printIntArray(arr);

		int max = arr[0][0];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 != 0) {
					arr[i][j] = max;
				}
			}
		}

		System.out.println();
		printIntArray(arr);
	}

//    Магическим квадратом порядка n называется квадратная матрица размера nxn, 
//    составленная из чисел 1, 2, 3,..., 2n так, что суммы по каждому столбцу, 
//    каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат

	public static void sixteenthTask() {
		System.out.println("Answer sixteenthTask: ");

		int n;

		n = enterIntValueFromConsole("Введите порядок магического квадрата: ");

		int[][] arr = new int[n][n];
		boolean check = false;

		if (n > 1 && n % 2 == 1) {
			System.out.println("Магический квадрат нечетного порядка (сиамский метод)");
			check = true;
			int x = 0;
			int y = (n / 2);
			for (int k = 1; k <= n * n; k++) {
				arr[x][y] = k;
				if (k % n == 0) {
					x++;
				} else {
					x--;
					y++;
					if (x < 0)
						x = n - 1;
					if (y > n - 1)
						y = 0;
				}
			}
		} else {
			fillingArray(arr);
			if (n % 4 == 0) {
				System.out.println("Магический квадрат порядка кратного четырём (метод Рауз - Болла)");
				check = true;
				int y = 1;
				int m = n / 2;
				for (int x = 0; x < m; x++) {
					for (int i = 0; i < m / 2; i++) {
						if (y == m + 1) {
							y = 0;
						}
						if (y == (m + 2)) {
							y = 1;
						} else {
							int s = (n - x) - 1;
							int b = (n - y) - 1;
							int temp;
							temp = arr[x][y];
							arr[x][y] = arr[s][b];
							arr[s][b] = temp;
							temp = arr[x][b];
							arr[x][b] = arr[s][y];
							arr[s][y] = temp;
							y += 2;
						}
					}
				}
			} else {
				if (n > 2 && n % 2 == 0) {
					System.out.println("Магический квадрат порядка кратного двум ");
					check = true;
					int x;
					int y;
					int r = ((n / 2) - 1) / 2;
					int m = n / 2 - 1;
					for (x = 0; x <= m; x++) {
						y = x;
						for (int k = 0; k < r; k++) {
							if (y > m) {
								y = 0;
							}
							int s = (n - x) - 1;
							int b = (n - y) - 1;
							int temp;
							temp = arr[x][y];
							arr[x][y] = arr[s][b];
							arr[s][b] = temp;
							temp = arr[x][b];
							arr[x][b] = arr[s][y];
							arr[s][y] = temp;
							y += 1;
						}
					}
					x = 0;
					y = r;
					for (int k = 0; k <= m; k++) {
						if (y > m) {
							y = 0;
						}
						int s = (n - x) - 1;
						int temp;
						temp = arr[x][y];
						arr[x][y] = arr[s][y];
						arr[s][y] = temp;
						x++;
						y++;
					}
					x = 0;
					y = r + 1;
					for (int k = 0; k <= m; k++) {
						if (y > m) {
							y = 0;
						}
						int b = (n - y) - 1;
						int temp;
						temp = arr[x][y];
						arr[x][y] = arr[x][b];
						arr[x][b] = temp;
						x++;
						y++;
					}
				}
			}
		}

		if (check) {
			printIntArray(arr);
		} else {
			System.out.println("Размер матрицы должен быть больше двух!!!");
			sixteenthTask();
		}
		System.out.println();

	}

	/* ---------------------------- */

	@SuppressWarnings("resource")
	public static int enterIntValueFromConsole(String str) {
		Scanner in = new Scanner(System.in);
		System.out.print(str);
		while (!in.hasNextInt()) {
			in.next();
			System.out.print(str);
		}
		return in.nextInt();

	}

	private static void fillingArray(int[][] arr) {
		int k = 1;
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr.length; y++) {
				arr[x][y] = k;
				k++;
			}
		}
	}

	private static void printIntArray(int[][] arr) {
		for (int[] elem : arr) {
			System.out.println(Arrays.toString(elem));
		}
	}

	private static void printDoubleArray(double[][] arr) {
		for (double[] elem : arr) {
			System.out.println(Arrays.toString(elem));
		}
	}

	private static void arraySortByIncrease(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	private static int[] arraySortByDecrease(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
}
