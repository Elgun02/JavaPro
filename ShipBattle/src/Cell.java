import java.security.PublicKey;
import java.util.Objects;

public class Cell {

    private boolean isShip;

    public Cell(boolean isShip) {
        this.isShip = isShip;
    }

    public boolean isShip() {
        return isShip;
    }

    // Сеттер для корабля
    public void setShip(boolean ship) {
        isShip = ship;
    }

    // Выводим в консоль символ корабля если isShip = true, а противном случае вывдоится пустое поле " "
    @Override
    public String toString() {
        if (isShip) {
            return "\uD83D\uDEA2";
        }
        else return "≈";
    }

    @Override
    public int hashCode() {
        return Objects.hash(isShip);
    }
}