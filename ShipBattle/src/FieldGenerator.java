import java.util.Random;

public class FieldGenerator {
    private final static int FieldSize = 10; // Размер поле
    private final static int ShipProbability = 10; // Вероятность попадение корабля в поле
    public Field generateField() {
        Random random = new Random();

        // Создаем поле и указывем вероятность попадение корабля
        Cell[][] cells = new Cell[FieldSize][FieldSize];
        for (int i = 0; i < FieldSize; i++) {
            for (int j = 0; j < FieldSize; j++) {
                int number = random.nextInt(100); // 0-99
                boolean isShip = (number < ShipProbability); // true, when number = 0-9
                cells[i][j] = new Cell(isShip);
            }
        }
        return new Field(cells);
    }
}