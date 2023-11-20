import java.util.Comparator;
import java.util.List;

public class Search {
    public PensionFund findMaxMembers(List<PensionFund> pensionFunds) {
        return pensionFunds.stream()
                .max(Comparator.comparingInt(x -> x.getMembersList().size()))
                .orElse(null);
    }

    public String findNameMaxPension(List<Worker> workerList) {
         return workerList.stream()
                .max(Comparator.comparingDouble(Worker::calculatePension))
                .map(Worker::getName)
                .orElse("");
    }

    public List<Worker> findLosers(List<PensionFund> pensionFunds) {
        return pensionFunds.stream()
                .filter(x -> !x.getState())
                .flatMap(x -> x.getMembersList().stream())
                .toList();
    }

    public double findAveragePension(List<PensionFund> pensionFunds) {
        return pensionFunds.stream()
                .mapToDouble(PensionFund::calculateMedianPension)
                .average()
                .orElse(0.0);
    }

    public double findAveragePensionWorkers(List<Worker> workerList) {
        return workerList.stream()
                .mapToDouble(Worker::calculatePension)
                .average()
                .orElse(0.0);
    }

    public double findMaxPensionUpTo25(List<Worker> workerList) {
        return workerList.stream()
                .filter(x -> x.getAge() < 25)
                .mapToDouble(Worker::calculatePension)
                .max()
                .orElse(0.0);
    }

    public Worker jrWorker(List<Worker> workerList) {
        return workerList.stream()
                .min(Comparator.comparing(Worker::getAge))
                .orElse(null);
    }

    public Worker seniorWorker(List<Worker> workerList) {
        return workerList.stream()
                .max(Comparator.comparing(Worker::getAge))
                .orElse(null);
    }
}
