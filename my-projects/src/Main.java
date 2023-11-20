import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        GeneratorPensionFundFile generatorPensionFundFile = new GeneratorPensionFundFile(); // <- При желании можете обновить список
        GeneratorWorkerFile generatorWorkerFile = new GeneratorWorkerFile();                // <- При желании можете обновить список
        GeneratePensionFund generatePensionFund = new GeneratePensionFund();
        List<PensionFund> pensionFunds = generatePensionFund.generate();
        List<Worker> workersList = pensionFunds.stream()
                .flatMap(x -> x.getMembersList().stream())
                .toList();

        Search search = new Search();
        Scanner sc = new Scanner(System.in);
        boolean console = true;
        while (console) {
            System.out.print("\u001B[32mConsole: \u001B[0m");
            String input = sc.next();

            switch (input) {
                case "/fund_size":               // <- Количество всех фондов
                    System.out.println("\u001B[33mКоличество Всех Фондов: \u001B[0m" + pensionFunds.size());
                    break;
                case "/member_size":             // <- Количество всех участников
                    System.out.println("\u001B[33mКоличество Всех Участников: \u001B[0m" + workersList.size());
                    break;
                case "/find_max_members":        // <- Найти фонд с максимальным количеством участников
                    System.out.println("\u001B[33mФонд с максимальным количеством участников: \u001B[0m");
                    search.findMaxMembers(pensionFunds).info();
                    break;
                case "/find_name":               // <- Найти имя участника с максимальной пенсии среди всех работников
                    System.out.println("\u001B[33mИмя участника с максимальной пенсии: \u001B[0m" + search.findNameMaxPension(workersList));
                    break;
                case "/find_losers":             // <- Найти количество людей которые стали жертвами не государственными фондами
                    System.out.println("\u001B[33mКоличество людей которые стали жертвами: \u001B[0m" + search.findLosers(pensionFunds).size());
                    break;
                case "/average_pension":         // <- Средняя пенсия среди всех пенсионных фондов
                    System.out.println("\u001B[33mСредняя пенсия среди фондов: \u001B[0m" + (int) search.findAveragePension(pensionFunds));
                    break;
                case "/average_pension_workers": // <- Средняя пенсия среди всех работников
                    System.out.println("\u001B[33mСредняя пенсия среди работников: \u001B[0m" + (int) search.findAveragePensionWorkers(workersList));
                    break;
                case "/max_pension_25":          // <- Максимальная пенсия среди работников до 25 лет
                    System.out.println("\u001B[33mМаксимальная пенсия среди работников до 25 лет: \u001B[0m" + (int) search.findMaxPensionUpTo25(workersList));
                    break;
                case "/jr_worker":               // <- Найти самого молодого работника
                    System.out.println("\u001B[33mСамый младший работник: \u001B[0m");
                    search.jrWorker(workersList).info();
                    break;
                case "/senior_worker":           // <- Найти самого старшего работника
                    System.out.println("\u001B[33mСамый старший работник: \u001B[0m");
                    search.seniorWorker(workersList).info();
                    break;
                case "/exit":                    // <- Завершить программу
                    System.out.println("\u001B[35mПрограмма закрыта.\u001B[0m");
                    console = false;
                    break;
                case "/clear":                   // <- Очистить консоль
                    for (int i = 0; i < 50; i++) {
                        System.out.println();
                    }
                    System.out.println("\u001B[35mConsole cleared.\u001B[0m");
                    break;
                default:
                    System.out.println("\u001B[31mcommand not found\u001B[0m");
            }
        }
    }
}