import java.util.Objects;
import java.util.Set;

public class Worker extends Person implements AbleToCalculatePension{
    private int minSalary;
    private int maxSalary;
    private Set<Profession> profession;
    public Worker(String name, int age, int growth, double weight, int minSalary, int maxSalary) {
        super(name, age, growth, weight);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public Worker(String name, int minSalary, int maxSalary, int age) {
        super(name, minSalary, maxSalary, age);
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    public Worker(String workerInfo){
        super("", 0, 0, 0);
        String[] arr = workerInfo.split(" ");

        this.setName(arr[0]);
        this.setMinSalary(Integer.parseInt(arr[1]));
        this.setMaxSalary(Integer.parseInt(arr[2]));
        this.setGender(Gender.valueOf(arr[3]));
        this.setAge(Integer.parseInt(arr[4]));
    }

    public void info() {
        System.out.println("Имя: " + getName());
        System.out.println("Возраст: " + getAge());
        System.out.println("Пол: " + getGender());

    }

    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");
    }

    @Override
    public void die(int years) {
        System.out.println("Этот человек не доживет до пенсии и умрет через " + years + " лет");
    }

    @Override
    public double calculatePension() {
        double pension;
        if (getGender() == Gender.MALE) {
            pension = (CalculatorUtils.calculateAverage(minSalary, maxSalary)) * 0.25;
        }
        else if (getGender() == Gender.FEMALE) {
            pension = (CalculatorUtils.calculateAverage(minSalary / 2, maxSalary * 2)) * 0.25;
        }
        else {
            pension = 0;
        }

        if (profession == null) {
            return pension;
        }
        else {
            int i = profession.size() / 3;
            return (pension * (i * 0.05)) + pension;
        }
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public Set<Profession> getProfession() {
        return profession;
    }

    public void setProfession(Set<Profession> profession) {
        this.profession = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Worker worker = (Worker) o;
        return minSalary == worker.minSalary && maxSalary == worker.maxSalary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), minSalary, maxSalary);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name=" + getName() +
                ", minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                ", gender=" + getGender() +
                '}';
    }
}