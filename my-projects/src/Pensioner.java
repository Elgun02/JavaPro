import java.util.Objects;

public class Pensioner extends Person{
    private double pension;
    public Pensioner(String name, int age, int growth, double weight, double pension) {
        super(name, age, growth, weight);
        this.pension = pension;
    }

    @Override
    public void die() {
        System.out.println("Этот пенсионер умер, он заработал: " + (getAge() -50) * pension);
    }

    @Override
    public void die(int years) {
        System.out.println("Этот пенсионер умрет через " + years + " лет");

    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pensioner pensioner = (Pensioner) o;
        return Double.compare(pensioner.pension, pension) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pension);
    }

    @Override
    public String toString() {
        return "Pensioner{" +
                "pension=" + pension +
                '}';
    }
}