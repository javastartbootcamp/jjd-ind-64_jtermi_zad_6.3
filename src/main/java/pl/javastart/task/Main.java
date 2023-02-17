package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfRows;
        int numberOfColumns;
        String divisionLine = "\n";

        System.out.println("Podaj liczbę wierszy.");
        numberOfRows = scanner.nextInt();
        System.out.println("Podaj liczbę kolumn");
        numberOfColumns = scanner.nextInt();

        int[][] array = new int[numberOfRows][numberOfColumns];

        for (int i = 0; i < numberOfColumns; i++) {
            divisionLine = (divisionLine + "------");
        }

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                array[i][j] = i * j;
                System.out.printf("%5d|", array[i][j]);
            }
            System.out.println(divisionLine);
        }
    }
}
