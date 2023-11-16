public class Saver {
    public void save() throws IllegalAccessException {
        something();
    }

    public void something() throws IllegalAccessException {
        throw new IllegalAccessException();
    }
}
