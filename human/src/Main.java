import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Human firstHumanMom = new Human("Nezuko", 45);
        Human firstHumanDad = new Human("Schroder", 47);
        Human humanFirst = new Human("Kat-su", firstHumanMom, firstHumanDad, 21);

        Human secondHumanMom = new Human("Hikari", 52);
        Human secondHumanDad = new Human("Eren", 48);
        Human humanSecond = new Human("Kano", secondHumanMom, secondHumanDad, 30);

        Human thirdHumanMom = new Human("Hana", 40);
        Human thirdHumanDad = new Human("Kenji", 43);
        Human humanThird = new Human("Yuki", thirdHumanMom, thirdHumanDad, 26);

        Human fourthHumanMom = new Human("Sakura", 35);
        Human fourthHumanDad = new Human("Haruto", 39);
        Human humanFourth = new Human("Mio", fourthHumanMom, fourthHumanDad, 19);

        Human fifthHumanMom = new Human("Akemi", 50);
        Human fifthHumanDad = new Human("Hiroshi", 55);
        Human humanFifth = new Human("Akihiko", fifthHumanMom, fifthHumanDad, 28);

        Human sixthHumanMom = new Human("Miyuki", 38);
        Human sixthHumanDad = new Human("Takeshi", 42);
        Human humanSixth = new Human("Yusuke", sixthHumanMom, sixthHumanDad, 22);

        List<Human> humans = new ArrayList<>();
        humans.add(humanFirst);
        humans.add(humanSecond);
        humans.add(humanThird);
        humans.add(humanFourth);
        humans.add(humanFifth);
        humans.add(humanSixth);

        List<String> parentNames = humans.stream()
                .filter(human -> human.getMother() != null && human.getFather() != null)
                .map(human -> human.getFather().getName() + ", " + human.getMother().getName())
                .toList();

        List<String> motherNames = humans.stream()
                .filter(Objects::nonNull)
                .filter(human -> human.getAge() > 25)
                .map(human -> human.getMother().getName())
                .toList();

        System.out.println("Все Родители: " + parentNames);
        System.out.println("Мамы: " + motherNames);

    }
}