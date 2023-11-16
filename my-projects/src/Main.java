import java.io.FileNotFoundException;
import java.time.DayOfWeek;
import java.util.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Worker> membersList = new ArrayList<>();
        Set<Profession> professions = new HashSet<>();
        Map<DayOfWeek, Boolean> workDays = new HashMap<>();
        CreateObject createObject = new CreateObject();

        workDays.put(DayOfWeek.MONDAY, true);
        workDays.put(DayOfWeek.TUESDAY, true);
        workDays.put(DayOfWeek.WEDNESDAY, true);
        workDays.put(DayOfWeek.THURSDAY, true);
        workDays.put(DayOfWeek.FRIDAY, true);
        workDays.put(DayOfWeek.SATURDAY, false);
        workDays.put(DayOfWeek.SUNDAY, false);

        professions.add(Profession.PROGRAMMER);
        professions.add(Profession.DOCTOR);
        professions.add(Profession.ADVOCATE);
        professions.add(Profession.BUILDER);
        professions.add(Profession.TEACHER);
        professions.add(Profession.RACER);

        createObject.generate();



    }
}