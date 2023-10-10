import java.util.Arrays;

public class Field {
    private Cell[][] cells;

    public Field(Cell[][] cells) {
        this.cells = cells;
    }

    // Геттер для поля cells
    public Cell[][] getCells() {
        return cells;
    }

    // Сеттер для поля cells
    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    public  boolean checkCell(int row, int column) {
        Cell targetCell = cells[row][column];
        return targetCell.isShip();
    }

    @Override
    public String toString() {
        return Arrays.deepToString(cells);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(cells);
    }
}