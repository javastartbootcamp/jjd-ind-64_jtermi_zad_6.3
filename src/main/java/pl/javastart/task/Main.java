package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Logic logic = new Logic();
        int[][] array = logic.createTable();
        logic.fillAndPrintTable(array);

    }
}