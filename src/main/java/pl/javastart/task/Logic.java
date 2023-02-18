package pl.javastart.task;

import java.util.Scanner;

public class Logic {

    public int[][] createAndFillTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę wierszy.");
        int numberOfRows = scanner.nextInt();
        System.out.println("Podaj liczbę kolumn");
        int numberOfColumns = scanner.nextInt();
        int[][] array = new int[numberOfRows][numberOfColumns];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i * j;
            }
        }
        return array;
    }

    public void printTable(int[][] array) {
        String divisionLine = "\n";
        for (int i = 0; i < array[0].length; i++) {
            divisionLine = (divisionLine + "------");
        }
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.printf("%5d|", anInt);
            }
            System.out.println(divisionLine);
        }
    }
}
