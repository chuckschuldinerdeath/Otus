import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumOfPositiveElements(new int[][]{{1, 3, 2, 4, 5}, {2, 5, 2, 5, 6}}));
        System.out.println();
        intSize(5, 5);
        System.out.println();
        generateArrayDiagonal();
        System.out.println();
        System.out.println(findMax(new int[][]{{1, 4, 5, 6, 7, 4}, {2, 35, 6, 4, 3}}));
        System.out.println();
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {8, 3, 5, 6}};
        sumSecondLine(array);


    }

    public static int sumOfPositiveElements(int[][] in) {
        int sum = 0;
        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[i].length; j++) {
                sum += in[i][j];
            }
        }
        return sum;
    }

    public static void intSize(int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void generateArrayDiagonal() {

        int width = 12;
        int height = 12;
        char defaultChar = '*';

        char[][] array = new char[height][width];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = defaultChar;

            }
        }

        for (int i = 0; i < height; i++) {
            array[i][i] = '0';
        }
        for (int j = width - 1; j >= 0; j--) {
            for (int k = 0; k < height; k++) {
                if (j + k == height - 1) {
                    array[j][k] = '0';
                }

            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }

            }
        }
        return max;
    }

    public static int sumSecondLine(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        int[] str2 = arr[1];
        int sumstr2 = 0;
        for (int j = 0; j < str2.length; j++) {
            int i = str2[j];
            sumstr2 += i;
        }
        System.out.println(sumstr2);

            return sumstr2;

        }
}