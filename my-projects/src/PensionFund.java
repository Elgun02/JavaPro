import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PensionFund {
    private String fundName;
    private boolean state;
    private final String dateOfCreation;
    private List<Worker> membersList;
    private Map<DayOfWeek, Boolean> workDays;

    public PensionFund(String fundName, boolean state, String dateOfCreation) {
        this.fundName = fundName;
        this.state = state;
        this.dateOfCreation = dateOfCreation;

    }

    public void info() {
        if (isWorkDay(LocalDate.now().getDayOfWeek())) {
            System.out.println("Pension Fund OPENED.");
        }
        else {
            System.out.println("Pension Fund CLOSED.");
        }

        System.out.println();
        System.out.println("Fund Name: " + fundName);
        System.out.println("Date of creation: " + dateOfCreation);

        int value = 1000;
        if (membersList == null) {
            System.out.println("Number of members: " + 0);
        } else if (state && membersList.size() >= value){
            System.out.println("Number of members: " + membersList.size() / value + " THOUSAND");
        } else System.out.println("Number of members: " + membersList.size());
    }

    public double calculatePensionFor(AbleToCalculatePension obj) {
        if (isWorkDay(LocalDate.now().getDayOfWeek()) && state) {
            System.out.print("The pension is equal to: ");
            return obj.calculatePension();
        } else {
            System.out.println("Pension Fund is not working today.");
            System.out.println("Money was stolen from the fund.");
            System.out.print("The pension is equal to: ");
            return 0;
        }
    }

    public boolean isWorkDay(DayOfWeek dayOfWeek) {
        return workDays.getOrDefault(dayOfWeek, false);
    }

    public double calculateMedianPension() {
        if (membersList == null) {
            return 0;
        }
        double sum = 0.0;
        for (Worker worker : membersList) {
            sum += calculatePensionFor(worker);
        }
        return sum / membersList.size();
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
        return "PensionFund{" +
                "fundName='" + fundName + '\'' +
                ", state=" + state +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", membersList=" + membersList +
                '}';
    }
}