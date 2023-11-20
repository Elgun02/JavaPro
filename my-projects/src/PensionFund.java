import java.security.PublicKey;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

public class PensionFund {
    private String fundName;
    private boolean state;
    private String dateOfCreation;
    private List<Worker> membersList;
    private Map<DayOfWeek, Boolean> workDays;

    public PensionFund(String fundName, boolean state, String dateOfCreation) {
        this.fundName = fundName;
        this.state = state;
        this.dateOfCreation = dateOfCreation;
    }

    public PensionFund(String pensionFundInfo) {
        String[] arr = pensionFundInfo.split(", ");

        this.fundName = arr[0];
        this.state = Boolean.parseBoolean(arr[1]);
        setterWorkDays();
    }

    public void info() {
        if (isWorkDay(LocalDate.now().getDayOfWeek())) {
            System.out.println("Pension Fund OPENED.");
        }
        else {
            System.out.println("Pension Fund CLOSED.");
        }

        System.out.println("Fund Name: " + fundName + ".");
        System.out.println("Date of creation: " + dateOfCreation);

        int value = 1000;
        if (membersList == null) {
            System.out.println("Number of members: " + 0);
        } else if (state && membersList.size() >= value){
            System.out.println("Number of members: " + membersList.size() / value + " THOUSAND");
        } else System.out.println("Number of members: " + membersList.size());
    }

    private double calculatePensionFor(AbleToCalculatePension obj) {
        if (isWorkDay(LocalDate.now().getDayOfWeek()) && state) {
            return obj.calculatePension();
        } else {
            return 0;
        }
    }

    public int calculateMedianPension() {
        if (membersList == null) {
            return 0;
        }
        int sum = 0;
        for (Worker worker : membersList) {
            sum += calculatePensionFor(worker);
        }
        return sum / membersList.size();
    }

    private void setterWorkDays() {
        Map<DayOfWeek, Boolean> workDays = new HashMap<>();

        workDays.put(DayOfWeek.MONDAY, true);
        workDays.put(DayOfWeek.TUESDAY, true);
        workDays.put(DayOfWeek.WEDNESDAY, true);
        workDays.put(DayOfWeek.THURSDAY, true);
        workDays.put(DayOfWeek.FRIDAY, true);
        workDays.put(DayOfWeek.SATURDAY, false);
        workDays.put(DayOfWeek.SUNDAY, true);

        this.workDays = workDays;
    }

    public boolean isWorkDay(DayOfWeek dayOfWeek) {
        return workDays.getOrDefault(dayOfWeek, false);
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String date) {
        this.dateOfCreation = date;
    }

    public List<Worker> getMembersList() {
        return membersList;
    }

    public void setMembersList(List<Worker> membersList) {
        this.membersList = membersList;
    }
    public Map<DayOfWeek, Boolean> getWorkDays() {
        return workDays;
    }

    public void setWorkDays(Map<DayOfWeek, Boolean> workDays) {
        this.workDays = workDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PensionFund that = (PensionFund) o;
        return state == that.state && Objects.equals(fundName, that.fundName) && Objects.equals(dateOfCreation, that.dateOfCreation) && Objects.equals(membersList, that.membersList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fundName, state, dateOfCreation, membersList);
    }

    @Override
    public String toString() {
        return "[PensionFund: " +
                "Name = '" + fundName + '\'' +
                ", state = " + state +
                ", membersList = " +  membersList.size() +
                ']';
    }
}