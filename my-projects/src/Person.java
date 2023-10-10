import java.util.Objects;

public abstract class Person {
    private final String name;
    private int age;
    private int growth;
    private double weight;
    private Gender gender;

    public Person(String name, int age, int growth, double weight) {
        this.name = name;
        this.age = age;
        this.growth = growth;
        this.weight = weight;
    }

    private void getPersonInfo() {
        System.out.println();
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age + " лет.");
        System.out.println("Рост: " + growth + " см.");
        System.out.println("Вес: " + weight + " кг.");
    }

    private void personStatus() {
        System.out.print("Статус: ");
        if (age < 18 || age >= 70) {
            System.out.println("Отдыхаю дома.");
        } else System.out.println("Работаю.");
        System.out.println();
    }

    public void printInfo() {
        getPersonInfo();
        personStatus();
    }

    public void die() {
        System.out.println("Человек погиб");
    }

    abstract void die(int years);

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && growth == person.growth && Double.compare(person.weight, weight) == 0 && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, growth, weight);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", growth=" + growth +
                ", weight=" + weight +
                '}';
    }
}