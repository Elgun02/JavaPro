import java.time.DayOfWeek;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        PensionFund pensionFund = new PensionFund("Finland Pension Fund", true, "1892");
        Worker anna = new Worker("Anna", 19, 178, 62, 1000, 6000);
        List<Worker> membersList = new ArrayList<>();
        Set<Profession> professions = new HashSet<>();
        Map<DayOfWeek, Boolean> workDays = new HashMap<>();

        workDays.put(DayOfWeek.MONDAY, true);
        workDays.put(DayOfWeek.TUESDAY, true);
        workDays.put(DayOfWeek.WEDNESDAY, true);
        workDays.put(DayOfWeek.THURSDAY, true);
        workDays.put(DayOfWeek.FRIDAY, true);
        workDays.put(DayOfWeek.SATURDAY, false);
        workDays.put(DayOfWeek.SUNDAY, false);

        pensionFund.setWorkDays(workDays);

        professions.add(Profession.PROGRAMMER);
        professions.add(Profession.DOCTOR);
        professions.add(Profession.ADVOCATE);
        professions.add(Profession.BUILDER);
        professions.add(Profession.TEACHER);
        professions.add(Profession.RACER);

        anna.setProfession(professions);
        anna.setGender(Gender.MALE);
        membersList.add(anna);
        pensionFund.setMembersList(membersList);

        pensionFund.info();
        System.out.println(pensionFund.calculatePensionFor(anna));

    }
}